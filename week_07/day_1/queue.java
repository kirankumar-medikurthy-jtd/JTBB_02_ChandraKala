//queue
//dequeue

public class queue
{
	static Node first;
	static Node last;
	public static void queue(int data)
	{
		Node temp = new Node() ;
		temp.data = data;
		//first in first out method
		if(first == null)      // first one empty means
		{
		  	first = temp;
		  	last = temp; // lastone stores the data
		  	return;
		}
			last.next = temp;
			last = temp;
	}
	static void display()
	{
		Node temp = first;
		while(temp != null)
		{
			System.out.println(temp.data);  //while displaying first to last (data should not be null);
			temp = temp.next;  
		}
	}
	public static void deque()
	{
		if(first == null)
		{
			return;
		}
			Node temp = first;
			first=first.next;
			temp.next = temp;
			temp = null;	
	}
	
	public static void main(String[] args)
	{
		queue.queue(20);
		queue.queue(30);
		queue.queue(40);
		queue.queue(50);
		queue.queue(60);
		queue.queue(70);
		queue.queue(80);
		queue.queue(90);
		queue.deque();
		queue.display();
	}
}
class Node
{
    int data;
    Node next;
}

		 

