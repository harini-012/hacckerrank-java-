package hacckerank;
import java.util.*;
class LinkedList
{
	int task_id;
	
	LinkedList next ;
	public LinkedList(int task_id)
	{
		this.task_id=task_id;
		
		this.next=null;
	
	}
}
public class july30hr3
{
	LinkedList head;
	void insertAtEnd(int task_id)
	{
		LinkedList newNode=new LinkedList(task_id);
		if(head==null)
		{
			head=newNode;
			return;
		}
		LinkedList temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		
	}
	void insertAtPosition(int pos,int task_id)
	{
		LinkedList newNode=new LinkedList(task_id);
		if(pos<0)
		{
			System.out.println("Enter the valid position");
			return;
		}
		
		int index=0;
		
		if(pos==0)
		{
			newNode.next=head;
			head=newNode;
			return;
		}
		LinkedList temp=head;
		while(temp!=null&&index<pos-2)
		{
			temp=temp.next;
			index++;
			
		}
		if (temp == null) 
		{
            System.out.println("The position is beyond list size.");
            return;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	void display()
	{
		LinkedList temp=head;
		if(temp==null)
		{
			System.out.println("The linked list is empty");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.task_id+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[]args)
	{
		july30hr3 ll=new july30hr3();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			
			int task_id=sc.nextInt();
			ll.insertAtEnd(task_id);
			
		}
		
		
		int pos=sc.nextInt();
		int task_new=sc.nextInt();
		ll.insertAtPosition(pos, task_new);
		ll.display();
	}

}
