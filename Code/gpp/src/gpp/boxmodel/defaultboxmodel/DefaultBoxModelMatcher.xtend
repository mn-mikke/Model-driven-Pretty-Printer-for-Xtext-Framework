package gpp.boxmodel.defaultboxmodel
import java.util.*
import gpp.boxmodel.boxModel.*
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.*
import gpp.boxmodel.defaultboxmodel.defaultBoxModelDefinition.*
import org.eclipse.emf.common.util.BasicEList

class DefaultBoxModelMatcher { 
	def gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult match(List<Box> source, ParserRuleHeuristic heuristicRuleAppliedToSource, List<ParserRuleHeuristic> heuristicRules)
	{
		var tempHeuristicRules = heuristicRules;
		if(heuristicRuleAppliedToSource != null)
		{
			val result = matchHeuristic(source, heuristicRuleAppliedToSource, false);
			if(result.matched())
			{
				result.setUnprocessedRules(tempHeuristicRules);
				return result;
			}
		}
		while(!tempHeuristicRules.empty)
		{
			val heuristicRule = tempHeuristicRules.get(0);
			tempHeuristicRules = tempHeuristicRules.subList(1,tempHeuristicRules.size);
			val result = matchHeuristic(source, heuristicRule, true);
			if(result.matched())
			{
				result.setUnprocessedRules(tempHeuristicRules);
				return result;
			}	
		}
		return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult(source);
	}
	
	
	def gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult matchHeuristic(List<Box> source, ParserRuleHeuristic heuristicRule, boolean canMatchWholeSource)
	{
		val prevRest = new LinkedList<Box>();
		val segments = new LinkedList(heuristicRule.pattern.segments);
		var tempSource = source;
		var tempCanMatchWholeSource = canMatchWholeSource;
		while(!tempSource.empty)
		{
			val result = matchHeuristicWithPattern(tempSource, segments, tempCanMatchWholeSource);
			if(result.matched)
			{
				return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult(
					prevRest,
					result.getMatchedElements,
					result.getPostRest,
					null,
					heuristicRule
					)
			}
			else
			{
				prevRest.addLast(tempSource.get(0));
				tempSource = tempSource.subList(1,tempSource.size);
				tempCanMatchWholeSource = true;
			}
		}
		new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResult(prevRest);
	}
	
	
	def dispatch gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal matchSegment(List<Box> source, FiniteNumber currentSegment, List<Segment> patternSegments, boolean canMatchWholeSource)
	{
		if(source.size < currentSegment.value)
		{
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
		}
		else
		{
			return matchNextSegment(currentSegment.value, source, patternSegments,  canMatchWholeSource)
		}
	}
	
	def dispatch gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal matchSegment(List<Box> source, Terminal currentSegment, List<Segment> patternSegments, boolean canMatchWholeSource)
	{
		if(source.size < 1 ||
		!(source.get(0) instanceof Reference) ||
		!((source.get(0) as Reference).element instanceof Reference) ||
		!((source.get(0) as Reference).element as Keyword).value.equals(currentSegment.value)
		)
		{
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
		}
		else
		{
			return matchNextSegment(1, source, patternSegments, canMatchWholeSource)
		}
	}
	
	def dispatch gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal matchSegment(List<Box> source, AlternativesSegment currentSegment, List<Segment> patternSegments,  boolean canMatchWholeSource)
	{
		if(source.size < 1 || !matchAlternatives(source.get(0),currentSegment))
		{
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
		}
		else
		{
			return matchNextSegment(1, source, patternSegments, canMatchWholeSource);
		}	
	}
	
	def dispatch matchAlternatives(Box sourceElement, AlternativesSegment currentSegment)
	{
		return false;
	}
	
	def dispatch matchAlternatives(Reference sourceElement, AlternativesSegment currentSegment)
	{
		if(!(sourceElement.element instanceof Keyword))
		{
			return false;
		}
		val keyword = sourceElement.element as Keyword; 
		for(terminal : currentSegment.alternatives)
		{
			if(terminal.value.equals(keyword.value))
			{
				return true;
			}
		}
		return false;
	}
	
	def dispatch matchAlternatives(MultipleBox sourceElement, AlternativesSegment currentSegment)
	{
		var returnValue = true; 
		if(!sourceElement.type.equals("|"))
		{
			return false;
		}
		for(alternative : sourceElement.elements)
		{
			returnValue = returnValue && matchAlternatives(alternative, currentSegment);
		}
		return returnValue;
	}
	
	def dispatch gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal matchSegment(List<Box> source,Interval currentSegment, List<Segment> patternSegments, boolean canMatchWholeSource)
	{
		if(source.size < currentSegment.minimum)
		{
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
		}
		var position = getMaximumBound(source, currentSegment.maximum);
		while(position >= currentSegment.minimum)
		{
			val nextSegmentResult = matchNextSegment(position, source, patternSegments, canMatchWholeSource);
			if(nextSegmentResult.matched)
			{
				return nextSegmentResult;
			}
			position = position - 1;
		}
		return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
	}
	
	def dispatch getMaximumBound(List<Box> source, FiniteNumber number)
	{
		if(source.size < number.value)
		{
			return source.size;
		}
		else
		{
			return number.value;
		} 
	}
	
	
	def dispatch getMaximumBound(List<Box> source, InfiniteNumber number)
	{
		return source.size;
	}
	
	def matchNextSegment(int splitPossition, List<Box> source, List<Segment> patternSegments,  boolean canMatchWholeSource)
	{
		val nextElementSource = new LinkedList(source.subList(splitPossition,source.size));
		val nextSegmentResult = matchHeuristicWithPattern(nextElementSource, patternSegments, canMatchWholeSource);
		if(!nextSegmentResult.matched)
		{
			return nextSegmentResult;
		}
		else
		{
			val matchedElements = new LinkedList(source.subList(0,splitPossition));
			matchedElements.addAll(nextSegmentResult.getMatchedElements);
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal(matchedElements, nextSegmentResult.getPostRest);
		}
	}
	
	def gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal matchHeuristicWithPattern(List<Box> source, List<Segment> patternSegments, boolean canMatchWholeSource)
	{
		if(patternSegments.size == 0)
		{
			if(!canMatchWholeSource && source.size == 0)
			{
				return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
			}
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal(new LinkedList<Box>(), source);
		}
		else if(source.size == 0)
		{
			return new gpp.boxmodel.defaultboxmodel.DefaultBoxModelMatcherResultInternal();
		}
		else 
		{	
			return matchSegment(source, patternSegments.get(0), patternSegments.subList(1,patternSegments.size()), canMatchWholeSource);
		}
	}
	
}