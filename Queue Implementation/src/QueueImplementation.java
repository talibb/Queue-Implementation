/*
 * Done by: Talib Bacchus
 * To be used with Ball.java
 */

import java.util.Scanner;
public class QueueImplementation {
	public static Ball first=null; // maintains front of stack
	public static Ball last=null; // maintains back of stack
	
	public static void enqueue(String s)// adds balls to the queue
	{
		// initializes the ball object
		Ball newBall = new Ball();
		// sets the color of the ball
		newBall.setcolor(s);
		if(first == null) //checks the if queue is empty
		{
			/* if the queue is empty, we set the incoming ball object 
			 * as the last element in the queue and also set it as the first element.  
			 */
			last = newBall;
			first =last;
			
			
		}
		
		
		else // if queue is not empty
		{
			// set the incoming ball as the last link
			last.SetNextLink(newBall);
			last = last.GetNextLink();		
		}
		
				
	}
	
	public static void displayStack() //displays enqueued balls
	{
		Ball current = first;
		while(current != null){
			 System.out.println(current.getColor()+"->");
			 current = current.GetNextLink();
		}

	}
	
	 public static void dequeue() // removes ball from queue
	{
		if(first != null)
		{
		 System.out.println(first.getColor());
		// System.out.println(last.getColor());
		 first=first.GetNextLink();
		 //System.out.println(first.getColor());

		 
		}
		
		
	}
	 public static String peek() //shows the ball in the front of the queue
	 {
		 return first.getColor();
	 }
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 
		int command = 1; // allows while loop to run
		while(command != 4)
		{
			System.out.println("Press 1 to enqueue");
			System.out.println("Press 2 to dequeue");
			System.out.println("Press 3 to peek");
			System.out.println("Press 4 to exit");
			command = keyboard.nextInt();
			keyboard.nextLine();
			String s;			
			switch(command)
			{
			
			case 1:
				System.out.println("Enter to color ball you would like to enqueue");
				s = keyboard.nextLine();
				enqueue(s);
				displayStack();
				break;
			case 2:
				
				dequeue();
				
				
				break;
			case 3:
				System.out.println(peek());
				System.out.println();
				break;
			}
			
		}
		
		
	}
}
	


