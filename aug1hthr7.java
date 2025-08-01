/*You are building a library catalog where each book has a book ID and title. Books are stored in a
linked list. Write a program to append a new book at the end of the catalog and display the full list.
Sample Input:
3
101
Data Structures
102
Java Programming
103
Database Systems
Sample output:
Library Catalog:
101 - Data Structures
102 - Java Programming
103 - Database Systems*/

package hacckerank;
import java.util.*;
class LibraryBook
{
	int book_id;
	String book_name;
	LibraryBook next;
	public LibraryBook(int book_id,String book_name)
	{
		this.book_id=book_id;
		this.book_name=book_name;
		this.next=null;
	}
}
public class aug1hthr7 
{
	LibraryBook head;
	void insertAtEnd(int book_id,String book_name)
	{
		LibraryBook newNode=new LibraryBook(book_id,book_name);
		if(head==null)
		{
			head=newNode;
			return;
		}
		LibraryBook temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		
	}
	void display()
	{
		LibraryBook temp=head;
		if(head==null)
		{
			System.out.println("No Books are available");
			return;
		}
		while(temp!=null)
		{
			System.out.println(temp.book_id+" - "+temp.book_name);
			 
			temp=temp.next;
			
		}
	}
	
	
	public static void main(String[] args) 
	{
		aug1hthr7 lb=new aug1hthr7();
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			int book_id=sc.nextInt();
			sc.nextLine();
			String book_name=sc.nextLine();
			lb.insertAtEnd(book_id, book_name);
		}
		System.out.println("Library Catolog:");
		lb.display();

	}

}
