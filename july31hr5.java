package hacckerank;
import java.util.*;
class project
{
	int pro_id;
	String pro_name;
	project next;
	public project(int pro_id,String pro_name)
	
	{
		this.pro_id=pro_id;
		this.pro_name=pro_name;
		this.next=null;
	}
}
public class july31hr5 
{
	project head;
	void insertAtEnd(int pro_id,String pro_name)
	{	
		
		project newNode=new project(pro_id,pro_name);
		if(head==null)
		{
			head=newNode;
			return;
		}
		project temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
			
		}
		temp.next=newNode;
		
	}
	void deleteAtPosition(int search_id)
	{
		if(head==null)
		{
			System.out.println("There is no elements in the list");
			return;
		}
		if(head.pro_id==search_id)
		{
			head=head.next;
			return;
		}
		project temp=head;
		
		while(temp.next!=null&&temp.next.pro_id!=search_id)
		{
			temp=temp.next;
			
		}
		if(temp.next==null)
		{
			System.out.println("No id is found");
			
		}
		else
		{
		
		temp.next=temp.next.next;
	}
	}
	void display()
	{
		project temp=head;
		if(head==null)
		{
			System.out.println("No elements in the list");
			return;
		
		}
		while(temp!=null)
		{
			System.out.println("Product id:"+temp.pro_id+" Project name:"+temp.pro_name);
			temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		july31hr5 pl=new july31hr5();
		Scanner sc=new Scanner(System.in);
		String choice;
		do
		{
		System.out.println("Enter the choice");
		System.out.println("1.Add\n2.Delete\n3.Print");
		choice=sc.next();
		switch(choice)
		{
		case "Add":
			System.out.println("Enter the number of input");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter the task id");
			int pro_id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the project name");
			String pro_name=sc.next();
			pl.insertAtEnd(pro_id, pro_name);
			}
			break;
		case "Delete":
			System.out.println("Enter the id to be deleted");
			int search_id=sc.nextInt();
			pl.deleteAtPosition(search_id);
			break;
		case "Print":
			pl.display();
			break;
		case "Exit":
			System.out.println("Exit");
			break;
		}
		}while(!choice.equals("Exit"));
		
			
			
		
			
			
			
		}
		

	}


