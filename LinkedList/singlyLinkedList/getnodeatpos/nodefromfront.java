/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList ..get node from front
 *  pos=is one 
 *  list=80,50,10
 *  output=80
 *  sr.code-LL9
 *  */
import java.util.Scanner;

import linkedlistss.linked.node;


public class nodefromfront                                                   //class name
{

	static Scanner nav=new Scanner(System.in);                           // calling Scanner and creating object nav
	  static node head;
		public nodefromend ()                                          //constructor of class  intersectionlist
		{
			head=null;                                               //initialization of class variable
		}
	 public static class node                                      //second class node
	 {
		 node next;
		 int data;
		 node(int data)                                       // constructor of class node
		 {
			 this.data=data;                                //initialization of instances variable of class node using this()
			 next=null;                                    //initialization of next to null
		 }
	 }

	 public static void add(int new_data)              //insert at the begining of the list
	 {    node new_node=new node( new_data);
		 if(head==null)
		 {
			head=new_node;
			return;
		 }
		 new_node.next=head;
		 head=new_node;
	 }
	 public static int  getnode(int pos)    //method to get node using position from begining
	 {   int cnt=1;
		 if(head==null)
		 {
			 System.out.println("The list is empty");
			 return -1;
		 }
		 node temp=head;
		 while(temp!=null)           //count total size of list
		 {
			 temp=temp.next;
			 cnt++;
		 }
		 node last=head;
		 if(cnt<pos)
		 {
			 System.out.println("the size of list is smaller then the position");
			 return -1;
		 }
		 for(int i=1;i<pos;i++)
		 {   if(head.next==null)
			     return -1;
			 last=last.next;
		 }
		 return last.data; //return the data and position
	 }
	 public static void display()  //method to print linkedlist
		{
			node dis=head;
			if(head==null) //if list is empty
				{System.out.println("Linkedlist is empty");
				  return;
				}
			while(dis!=null)  //traversing through list to print node.data
				{System.out.print(dis.data+" , ");
			    dis=dis.next;}
		}
	 public static void main(String agrs[]) //main method
	 {   nodefromfront n=new nodefromfront();  //calling constructor of class  nodefromfront()
		 System.out.println("linked list ");
		 add(10);
		 add(50);
		 add(80);
		 display();
		 System.out.println("NODE .DATA "+getnode(10));
	 }
	}
