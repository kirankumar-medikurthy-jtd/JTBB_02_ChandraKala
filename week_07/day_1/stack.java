// adding the data (push)(POP) LIFO
public class stack
{
	 static Node top;
	 static void push (int data)
	{
	 Node temp = new Node();
	 temp.data = data;
	   if( top == null)
	   {
	    	top = temp; 
	   	return;
	   } 
		temp.next = top;
		top = temp; 
	}
	static void display()
	{
	Node temp  = top ;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next; 
			// adding one by one number
		}
	}
	static void removeOne()
	{
		if(top == null)
		{
			return ;
		}
			 Node temp = top;
			 top = top.next;
			 temp.next = null;
			 temp = null;	
	}
	public static void main(String [] arg)
	{
		stack.push (10);
		stack.push (12);
		stack.push (15);
		stack.push (14);
		stack.push (17);
		stack.push (19);
		stack.push (100);
		stack.push (150);
		stack.removeOne();
		// last one is removing o/t: 100 19 17 14 15 12 10      150 is removing
		stack.display();	
	}
}
	class Node
	{
		int data;
		Node next;
	}
		 

