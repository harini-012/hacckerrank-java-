package hacckerank;
import java.util.*;
class ProductNode
{
	int prodId;
	ProductNode next;
	public ProductNode(int proId)
	{
		this.prodId=proId;
		this.next=null;
		
	}
}
public class july29hr1 
{
	ProductNode head;
	public void insertAtEnd(int proId)
	{
		ProductNode newNode=new ProductNode(proId);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			ProductNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		System.out.println(proId+" is inserted at End");
		
		
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("No product in the cart");
			return;
		}
		ProductNode temp=head;
		System.out.println("The inventory list is:");
		while(temp!=null)
		{
			System.out.println(temp.prodId);
			temp=temp.next;
		}
		System.out.println("Null");
	}
	public static void main(String[] args) 
	{
		july29hr1 pl=new july29hr1();
		Scanner sc=new Scanner(System.in);
		int choice,pId;
		do
		{
		System.out.println("****Inventory management system****");
		System.out.println("1.Insert\n2.Display\n3.Exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter your product id");
			pId=sc.nextInt();
			pl.insertAtEnd(pId);
			break;
		case 2:
			pl.display();
			break;
		case 3:
			System.out.println("Exiting");
			break;
		default:
			System.out.println("Enter correct available choice");
			break;
		}
		}while(choice!=3);
	

	}
}
