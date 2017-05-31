/*
 * Done by: Talib Bacchus.
 * To be used with StackImplementation.java or QueueImplementation.java.
 * This class is used for a simple demonstration of a stack and of a queue.
 */

/*
 * The Ball class contains a color and nextlink variables. Get and set methods are implemented
 * for each variable to illustrate how a stack and queue work respectively. 
 */
public class Ball {
	private Ball nextlink;
	private String color;
	
	public void setcolor(String b)
	{
		this.color = b;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void SetNextLink(Ball b)
	{
		this.nextlink = b;
	}
	
	public Ball GetNextLink()
	{
		return this.nextlink;
	}
	
	
}
