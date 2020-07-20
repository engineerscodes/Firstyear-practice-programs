/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList pairwise swap 
 *  list=1-->2-->3-->4
 *  swappedlist=2-->1-->4-->2
 *  
 *  sr.code-LL7
 *  */
import java.util.*;

public class pairwiselist                                          //class name
{ static Scanner nav=new Scanner (System.in);                     // calling Scanner and creating object nav
  static node head;                                              
	public pairwiselist()                                       //constructor of class pairwiselist
	{
		head=null;                                            //initialization head=null
	}

	public static class node                                //second class node
	{
		node next;
		int data;
		node(int data)                                  // constructor of class node
		{
			this.data=data;                           //initialization of instances variable of class node using this()
			next=null;                               //initialization of next to null
		}
	}
	
	public static void add(int new_data)         //insert at the begining
	{
		node new_node =new node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public static void pairswap()                   //method pairwise swap
	{
		if(head==null)
		{
			System.out.println("Not possible");
			return;
		}
		node last=head;
		while(last!=null && last.next!=null )
		{
			int d=last.data;
			last.data=last.next.data;
			last.next.data=d;
			last=last.next.next;
		}
	}
	public static void display()                  //displaying the list
	{   System.out.println("displaying list ---");
		node dis=head;
		if(head==null)
		{
			System.out.println("not possible list is empty");
		}
		while(dis!=null)
		{
			System.out.print(dis.data+" , ");
			dis=dis.next;
		}
	}

	public static void main(String naveen[])  //main method
	{   pairwiselist n=new pairwiselist();
	 /*This program is only for pair wise swaping a linkedlist 
	     * So,I have directly given values in add fuction u can edit this my caliing add function and adding values at runtime 
	     * For futhure information plz check r singllyLinkeList program and DoubllyLinkedlist code in Git
	     * 
	     * */
		System.out.println("entering elements in list");
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(60);
		add(55);
		System.out.println(" list ---");
		display();
		pairswap();
		System.out.println(" list --->>>>");
		display();

	}
}
