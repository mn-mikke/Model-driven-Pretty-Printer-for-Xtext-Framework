package gpp.formatting;

import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.utils.IBoxModelProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.formatting.impl.AbstractNodeModelFormatter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import com.google.inject.Inject;

public class GppNodeModelFormatter extends AbstractNodeModelFormatter
{	
	@Inject
	IBoxModelProvider boxModelProvider;
	
	PositionalOperatorTreeBuilder operatorTreeBuilder;

	boolean initialized = false;
	
	public void initialize()
	{
		BoxModel boxModel = boxModelProvider.getBoxModel();
		operatorTreeBuilder = new PositionalOperatorTreeBuilder(boxModel);
		initialized = true;
	}
	
	
	@Override
	public IFormattedRegion format(ICompositeNode root, int offset, int length) {
		if(!initialized)
		{
			initialize();
		}
		String indent = getIndentation(root, offset);
		List<AbstractTransformingOperatorImplementation> comments = new ArrayList<AbstractTransformingOperatorImplementation>();
		List<ICompositeOperatorTreeNode> operatorImplementationTree = operatorTreeBuilder.buildOperatorTree(root, comments);
		if(operatorImplementationTree.size() > 1)
		{
			throw new IllegalStateException("The operator implementationTree contains more then one root.");
		}
		ICompositeOperatorTreeNode operatorImplementationTreeWithOneRoot =operatorImplementationTree.get(0);
		List<Row> formattedRows = operatorImplementationTreeWithOneRoot.getFormattedString(
				AbstractPositionalOperatorImplementation.getLineSizeStatically(indent),
				true,
				offset,
				length
				);
		StringBuilder builder = new StringBuilder();
		boolean isFirst = true;
		for(Row row : formattedRows)
		{
			if(isFirst)
			{
				isFirst = false;
			}
			else
			{
				builder.append("\n");
			}
			addCommentsToBuilder(offset, length, indent + row.getCommentIndentation(), builder, row.getComments());
			if(!row.isEmpty())
			{
				builder.append(indent);
				builder.append(row.getValue());
			}
		}
		if(!isFirst)
		{
			builder.append("\n");
		}
		addCommentsToBuilder(offset, length, indent, builder, comments);
		return new FormattedRegion(offset, length, builder.toString());
	}
	
	protected void addCommentsToBuilder(int offset, int length, String indent, StringBuilder builder, List<AbstractTransformingOperatorImplementation> comments)
	{
		for(AbstractTransformingOperatorImplementation comment : comments)
		{
			if(comment.isRelevant(offset, length))
			{
				List<Row> commentValue = comment.getFormattedString(
						AbstractPositionalOperatorImplementation.getLineSizeStatically(indent),
						false,
						offset,
						length
					);
				for(Row commentRow : commentValue)
				{
					builder.append(indent);
					builder.append(commentRow.getValue());
					builder.append("\n");
				}
			}
		}
	}
	

	protected String getIndentation(ICompositeNode root, int fromOffset) {
		if (fromOffset == 0)
			return "";

		List<ILeafNode> r = new ArrayList<ILeafNode>();
		// add all nodes until fromOffset
		for(ILeafNode l: root.getLeafNodes()) {
			if (l.getOffset() >= fromOffset)
				break;
			else
				r.add(l);
		}

		// go backwards until first linewrap
		Pattern p = Pattern.compile("\\n([ \\t]*)");
		for (int i = r.size() - 1; i >= 0; i--) {
			Matcher m = p.matcher(r.get(i).getText());
			if (m.find()) {
				String ind = m.group(1);
				while (m.find())
					ind = m.group(1);
				return ind;
			}
		}
		return "";
	}
}
