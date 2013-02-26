package gpp.formatting;

import java.util.ArrayList;
import java.util.List;

public class UniversalCommentFormattingOperatorImplementation extends AbstractCommentFormattingOperatorImplementation
{
	@Override
	protected List<Row> getFormattedText()
	{
		String text = getText();
		String[] lines = text.split("\\n");
		List<Row> returnValue = new ArrayList<Row>();
		for(int i=0; i < returnValue.size(); i++)
		{
			returnValue.add(new Row(lines[i]));
		}
		return returnValue;
	}

}
