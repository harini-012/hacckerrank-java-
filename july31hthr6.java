/*Date : 31-07-25
You are managing a list of tasks for a project using a singly linked list. Each task has a unique ID and a
name. The tasks are arranged based on the order in which they are added.
Write a program that removes a task from a specific position in the linked list (0-based index).
Input Format:
• The first line contains an integer n, the number of initial tasks.
• The next n lines contain two values each: an integer id and a string name, representing each
task.
• The next line contains an integer pos, the position of the task to be removed.
Output Format:
• Print the updated task list after deletion, each task on a new line in the format:
id name
• If the position is invalid, print:
Invalid position
Constraints:
• 0 <= n <= 1000
• 0 <= id <= 10000
• 1 <= name length <= 20
• 0 <= pos < n
Sample Input:
4
101 Design
102 Development
103 Testing
104 Deployment
2
Sample Output:
101 Design
102 Development
104 Deployment*/
package hacckerank;
import java.util.*;
class TaskProject
{
	int task_id;
	String pro_name;
	TaskProject next;
	public TaskProject(int task_id,String pro_name)
	{
		this.task_id=task_id;
		this.pro_name=pro_name;
		this.next=null;
	}
}
public class july31hthr6 
{
	TaskProject head;
	void insertAtEnd(int task_id,String pro_name)
	{
		TaskProject newNode=new TaskProject(task_id,pro_name);
		if(head==null)
		{
			head=newNode;
			return;
		}
		TaskProject temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void deleteAtPosition(int pos)
	{
		if(pos<0|| head==null)
		{
			System.out.println("No position or element exits");
			return;
		}
		if(pos==0)
		{
			head=head.next;
			return;
		}
		TaskProject temp=head;
		int index=0;
		while(temp!=null&&index<pos-1)
		{
			temp=temp.next;
			index++;
		}
		if(temp==null||temp.next==null)
		{
			System.out.println("The position is not available");
			return;
		}
		temp.next=temp.next.next;
		
		
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("No element exixts");
			return;
		}
		TaskProject temp=head;
		while(temp!=null)
		{
			System.out.println(temp.task_id+" "+ temp.pro_name);
			temp=temp.next;
			
		}
	}
	public static void main(String[] args) 
	{
		july31hthr6 pt=new july31hthr6();
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			int task_id=sc.nextInt();
			
			String pro_name=sc.nextLine().trim();
			pt.insertAtEnd(task_id,pro_name);
		}
		pt.display();
		int pos=sc.nextInt();
		pt.deleteAtPosition(pos);
		pt.display();
		
		
	}

}
