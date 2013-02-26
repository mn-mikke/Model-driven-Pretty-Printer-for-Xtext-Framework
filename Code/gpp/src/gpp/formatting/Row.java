package gpp.formatting;

import java.util.ArrayList;
import java.util.List;

public final class Row
{
	private String value;
	private List<AbstractTransformingOperatorImplementation> comments;
	private String commentIndentation = "";
	
	public Row(String value)
	{
		if(value == null)
		{
			value = "";
		}
		this.value = value;
		comments = new ArrayList<AbstractTransformingOperatorImplementation>(0);
	}
	
	public String getValue()
	{
		return value;
	}
	
	public String getCommentIndentation()
	{
		return commentIndentation;
	}
	
	public void setCommentIndentation(String commentIndentation)
	{
		this.commentIndentation = commentIndentation;
	}
	
	public boolean isEmpty()
	{
		return value == null || value.equals("");
	}
	
	public List<AbstractTransformingOperatorImplementation> getComments()
	{
		return comments;
	}
	
}
