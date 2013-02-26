package gpp.boxmodel.utils

import org.eclipse.emf.common.util.*
import org.eclipse.xtext.*
import gpp.boxmodel.boxModel.*
import org.eclipse.xtext.TerminalRule
import gpp.boxmodel.operators.boxModelOperators.*
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import java.util.LinkedList
import java.util.regex.Pattern
import org.apache.commons.lang.StringEscapeUtils

class BoxModelSerializer {
		
	def generate(BoxModel boxModel)
	{
		'''
			xtext "«boxModel.xtextFile.importURI»"

			«placeImports(boxModel)»
			
			«placeDefaultTerminalRuleFormatting(boxModel.formatting.defaultTerminalRuleFormatting)»
			«placeTerminalRuleFormattings(boxModel.formatting.terminalRuleFormattings)»
			«placeKeywordTerminalRuleFormattings(boxModel.formatting.keywordTerminalRuleFormattings)»
			
			«placeParserRuleFormattings(boxModel.formatting.parserRuleFormatings)»
		'''.toString()
	}
	
	def placeImports(BoxModel boxModel)'''
		«FOR imp:boxModel.operatorsSection.imports»
		import "«imp.importURI»"
		«ENDFOR»
	'''
	
	def placeDefaultTerminalRuleFormatting(DefaultTerminalRuleFormatting defaultTerminalRuleFormatting)
	'''TBOX[«defaultTerminalRuleFormatting.name»]: «FOR c:defaultTerminalRuleFormatting.content SEPARATOR ", "»«placeTerminalRuleOperator(c)»«ENDFOR»;'''
	
	def placeTerminalRuleFormattings(EList<TerminalRuleFormatting> terminalRuleFormattings)
	{
		val StringConcatenation returnValue = new StringConcatenation();
		for(TerminalRuleFormatting terminalRule : terminalRuleFormattings)
		{
			returnValue.append(terminalRule.placeTerminalRuleFormatting());
			returnValue.newLineIfNotEmpty();
		}
		return returnValue
	}
	
	def placeTerminalRuleFormatting(TerminalRuleFormatting terminalRuleFormatting)
	'''TBOX[«terminalRuleFormatting.rule.name»]: «FOR c:terminalRuleFormatting.content SEPARATOR ", "»«placeTerminalRuleOperator(c)»«ENDFOR»;'''
	
	def placeKeywordTerminalRuleFormattings(EList<KeywordTerminalRuleFormatting> keywordTerminalRuleFormattings)
	{
		val StringConcatenation returnValue = new StringConcatenation();
		for(KeywordTerminalRuleFormatting terminalRule : keywordTerminalRuleFormattings)
		{
			returnValue.append(terminalRule.placeKeywordTerminalRuleFormatting());
			returnValue.newLineIfNotEmpty();
		}
		return returnValue
	}
	
	def placeKeywordTerminalRuleFormatting(KeywordTerminalRuleFormatting keywordTerminalRuleFormatting)
	'''TBOX[«keywordTerminalRuleFormatting.name», «keywordTerminalRuleFormatting.pattern.placeRegex»]: «FOR c:keywordTerminalRuleFormatting.content SEPARATOR ", "»«placeTerminalRuleOperator(c)»«ENDFOR»;'''
	
	def placeTerminalRuleOperator(TerminalRuleOperatorApplication operator)
	'''<«operator.operator.name»«placeParameters(operator.parameters)»>'''
	
	def placeParserRuleOperator(ParserRuleOperatorApplication operator)
	'''<«operator.operator.name»«placeParameters(operator.parameters)»>'''
	
	def placeParameters(EList<ParameterApplication> parameters)
	'''«FOR ParameterApplication parameter:parameters BEFORE " " SEPARATOR "," »«placeParameter(parameter)»«ENDFOR»'''
	
	def placeParameter(ParameterApplication parameter)
	'''«parameter.referencedParameter.name»=«placeParameterValue(parameter.value)»'''

	def dispatch placeParameterValue(StringValue value)
	'''«value.value.placeString»'''
	
	def dispatch placeParameterValue(IntValue value)
	'''«value.value»'''
	
	def dispatch placeParameterValue(ConstantReferenceValue value)
	'''«value.value.name»'''
	
	def placeParserRuleFormattings(EList<ParserRuleFormatting>  parserRuleFormattings)
	{
		val StringConcatenation returnValue = new StringConcatenation();
		for(parserRuleFormatting : parserRuleFormattings)
		{
			returnValue.append(placeParserRuleFormatting(parserRuleFormatting));
			returnValue.newLine();
			returnValue.newLine();
		}
		return returnValue;
	}
	
	def placeParserRuleFormatting(ParserRuleFormatting parserRuleFormatting)'''
		PBOX[«parserRuleFormatting.rule.name»]:
			«place(parserRuleFormatting.content, true)»
		;
	'''
	
		
	def dispatch place(ParserRuleOperatorApplication operator, boolean vertically)'''
		«IF vertically»
			«placeParserRuleOperator(operator)»[
				«place(operator.content, vertically)»
			]«ELSE»«placeParserRuleOperator(operator)»[«place(operator.content, vertically)»]«ENDIF»'''
	
	def dispatch place(Reference element, boolean vertically)
	{
		return place(element.element,vertically);
	}
	
	def dispatch place(RuleCall element, boolean vertically)
	'''«element.rule.name»'''
	
	def dispatch place(Keyword element, boolean vertically)
	'''«"'"»«element.value»«"'"»'''
	
	def dispatch place(AssignmentBox element, boolean vertically)
	'''«element.assignment.feature»:«place(element.terminal, false)»'''
	
	def dispatch place(CrossReference element, boolean vertically)
	'''[«placeTypeRef(element.type)»|«place(element.terminal, vertically)»]'''

	def placeTypeRef(TypeRef typeRef)
	'''«IF typeRef.metamodel !=null && typeRef.metamodel.alias !=null»«typeRef.metamodel.alias»::«ENDIF»«typeRef.classifier.name»'''
	
	def dispatch place(MultipleBox element, boolean vertically)
	{
		var delimiter = " "+ element.type + " ";
		if(vertically && element.type.equals("&"))
		{
			delimiter = " "+ element.type + "\n";
		}
		if(element.parenthesized)
		{
			return '''(«FOR e:element.elements SEPARATOR delimiter»«place(e, false)»«ENDFOR»)'''
		}
		else
		{
			return '''«FOR e:element.elements SEPARATOR delimiter»«place(e, false)»«ENDFOR»'''
		}
	}
	
	def dispatch place(GroupBox element, boolean vertically)
	{
		var delimiter =  " ";
		if(vertically)
		{
			delimiter = "\n";
		}
		if(element.parenthesized)
		{
			return '''(«FOR e:element.elements SEPARATOR delimiter»«place(e, false)»«ENDFOR»)'''
		}
		else
		{
			return '''«FOR e:element.elements SEPARATOR delimiter»«place(e, false)»«ENDFOR»'''
		}
	}
	
	def placeString(String string)
	'''"«string»"'''
	
	def placeRegex(String regex)
	'''"«StringEscapeUtils::escapeJava(regex)»"'''
	
}