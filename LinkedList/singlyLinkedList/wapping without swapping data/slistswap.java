/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList_Swapping without swapping data 
 *  by swapping node ex->a--b--c---d---e
 *  after swapping(b,d) ex-> a--d--c--b--e
 *  sr.code-LL4
 *  */
import java.util.*;

import linkedlistss.linkedswap.node;
public class slistswap                         //class name
{ static Scanner nav=new Scanner(System.in);  // calling Scanner and creating object nav
  static node head,prevX,currX,prevY,currY;  //object of node class

	public slistswap()                     // constructor of class slistswap
	{ head=null;                          //initialization head=null
	}
  public static class node              //second class node
  {
	  node next;                      // constructor of class node
	  int data;                      
	  node (int data)
	  {                              
		  this.data=data;         //initialization of instances variable of class node using this()
		  next=null;             //initialization of next to null
	  }
  }
  public static void add(int new_data) //insert at begin
  {
	  node new_node = new node(new_data);
	  new_node.next=head;
	  head=new_node;
  }
  public static void getX(int x) //A method to find the first element to swap
  {
	  if(head==null)
	  {
		  System.out.println(" list is empty");
		  return;
	  }
	  prevX=null;
	  currX=head;
	  while(currX!=null && currX.data!=x)  //A method to find the first elements  prevXnode and that node to swap
	  {  prevX=currX;
	     currX=currX.next;	  
	  }
  }
  public static void getY(int y)  //A method to find the Second element to swap
  {   if(head==null)
  {
	  System.out.println(" list is empty");
	  return;
  } 
  prevY=null;
  currY=head;
  while(currY!=null && currY.data!=y)   //A method to Second the first elements  prevYnode and that node to swap
  {
	  prevY=currY;
	  currY=currY.next;
  }
  
  }

public static void swap(int x,int y) //method to swap 
{   getX(x); 
    getY(y);
   if(x==y) //if both are same element
   {
	   System.out.println(" Swap is not possible");
	   return;
   }
   if(currX==null || currY==null )
   {
	   System.out.println("not possible elemts does not exist");
	   return;
   }
  if(prevX!=null) //if X is not null
	 prevX.next=currY; 
  else 
	  head=currY;  //if x is null
  
  if(prevY!=null) //if y is not null
		 prevY.next=currX; 
	  else 
		  head=currX; //if y is null
  
  node temp=currX.next; //temp to store currX--next-->address
  currX.next=currY.next;//assign   y's next to it
  currY.next=temp;//then y's--next-->=temp;
  System.out.println("List after swapping  x and y");
  display();
}
public static void display()  //method to display
{      if(head==null)
   {   System.out.print(" list is empty ");
      return;
	}
	   node last=head;
	   while(last!=null)
	   {
		   System.out.print(last.data+" , ");
		   last=last.next;
	   }
}
public static void main(String naveen[]) //main method
{   slistswap n=new slistswap();//craeting object(n) of the class sort_a_list to call constructor 
	System.out.println("enter the list ==");
	/*This program is only for sorting a linkedlist 
     * So,I have directly given values in add fuction u can edit this my caliing add function and adding values at runtime 
     * For futhure information plz check r singllyLinkeList program and DoubllyLinkedlist code in Git
     * 
     * */
	add(100);
	add(10);
	add(20);
	add(30);
	add(40);
	add(50);
	add(60);
	System.out.println("Display the linkedlist");
	display();
	System.out.println("enter the x and Y to swap");
	swap(nav.nextInt(),nav.nextInt());
	
	
}
}
