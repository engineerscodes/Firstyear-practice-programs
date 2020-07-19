/*  Author-M.NAVEEN
 *  engineerscodes
 *  code -DoubllyLinkedList
 *  sr.code-LL1
 *  */
import java .util.*;
public class doublelinked  //class name 
{   static Scanner nav=new Scanner(System.in); // calling Scanner and creating object nav
   static  node head;  //object of node class 

	public doublelinked() // constructor 
	{
	  head=null;	//intialize head=null 
	}
   public static class node    //second class node 
   {
	   node next,prev;        // objects 
	   int data;
	   node(int data)     //constructor 
	   {
		   next=prev=null;  //intialization of next and prev =null
		   this.data=data; //this() function refer to global
	   }
   }
   public  static void insertbegin(int new_data) //method to insert at the begining of the list
   {  
	   node new_node=new node(new_data);  //creating new node 
	   if(head==null)  //check  if list is null
	   {
		   head=new_node; //directly assign head=new_node
		   return;
	   }
	   new_node.next=head;  //assign newnodes--> next to head
	   head.prev=new_node; //assign prev<--heads=new_node 
	   head=new_node;     //assign head=new_node 
	   
   }
   public static void insertend(int new_data)//method to insert at the end of the list
   {
	   node new_node=new node(new_data);   //creating new node 
	   if(head==null)                     //check if list is null
	   {
		   	head=new_node;              //directly assign head=new_node
		   	return;
		    
	   }
	   node last=head;            //creating temp object of class node and assign head to last
	   while(last.next!=null)    //traversing the list using next till you reach the end
		   last=last.next;      //traversing the list by assigning last=last--next--->
	   last.next=new_node;     //assign last-->next=newnode
	   new_node.prev=last;    //assign prev<--newnode=last
   }
   public static void insertpos(node temp,int new_data) //method to insert after position 
   {
	   if(head.next==null) //check is head.next=null or only one node is present 
	   {
		   return;       //then return
	   }
	   node new_node =new node(new_data); //create a new node 
	    if(temp.next==null)  //if  list size is less than position
	    {   System.out.println("Not possible because list size is less than position so,newnode will be appened");
	    	insertend(new_data); //if list size is less than position  then add insert at end
	    	return;
	    }
	    new_node.next=temp.next; 
	    new_node.prev=temp;      
	    temp.next.prev=new_node;
	    temp.next=new_node;
	    
   }
   public static void display()//method to print display
   {    
	   if(head==null)  //check head is null or not 
	   {
		   System.out.println("List is empty");
		   return;
	   }
	   node first=head; // if head is not null
	   while(first!=null)
	   {
		   System.out.print(first.data+" , ");
		   first=first.next;
	   }
	   System.out.println("\n list in reverse-order ");//println reverse of the list using prev 
	   node last=head;
	   while(last.next!=null)
		  last= last.next;
	  
	   while(last.prev!=null) //traversing using prev from end to begining of the list
	   {
		   System.out.print(last.data+" , ");
		   last=last.prev;
	   }
	   if(last.prev==null) //println the first element of the list
	   {	  
	   System.out.print(last.data+" , ");
	   return;
	   }
   }
   public static void removefront()  //deletion from front of the list
   {
	   if(head==null) // if list is empty then return
	   {
		   System.out.println("List is empty");
		   return;
	   }
	   if(head.next==null) //if only one element is present 
	   {
		   System.out.println("The element is deleted :"+head.data);
		   head=null;
		   return;
	   }
	   System.out.println("The element is deleted :"+head.data);
	   head=head.next;
	   head.prev=null;
   }
   public static void removeend() //deletion from end 
   {
	   if(head==null)           //if list is empty
	   { System.out.println("List is empty");
	     return;   
	   }
	   if(head.next==null)   // if only one element exist
	   {
		   System.out.println("The element is deleted :"+head.data);
		   head=null;
		   return;
	   }
	   node last=head;   ///temp node to traverse till end of the list
	   while(last.next.next!=null)
	   {
		   
		   last=last.next;
	   }
	   System.out.println("the element delted is-"+last.next.data);
	   last.next.prev=null; // assigning last--next--prev-->null breaking the link
	   last.next=null;
	   
	   
   }
   public static void main(String arg[])  //main method
   {
	    System.out.println("Implementation of Doublly linkedlist ");
	    while(true)
	    { 
	    	System.out.println("\n1)Insert in Begining \n2)Insert at end \n3)Display \n4)EXIT \n5)remove from front \n6)remove from end \n7)Insert After position");
	    	switch(nav.nextInt())
	    	{
	    	case 1:System.out.println("Enter the data ->");
	    		insertbegin(nav.nextInt());
	    		break;
	    	case 2:System.out.println("Enter the data ->");
    		insertend(nav.nextInt());
    		break;
	    	case 4:System.exit(0);
	    	       break;
	    	       
	    	case 3:System.out.println("Displaying the list");    
	    	       display();
	    	       break;
	    	case 5:removefront();
	    	       break;
	    	case 6:removeend();
	    	   break;
	    	case 7:System.out.println("Enter the position -"); 
	    	      int pos=nav.nextInt();
	    	      if(pos==1)
	    	      {    System.out.println("enter the data ->");
	    	    	  insertbegin(nav.nextInt());
	    	      }
	    	      else 
	    	      {   node temp=head;
	    	    	  for(int i=1;i<pos;i++) //to travers till the position or to get the nodes from the postion 
	    	    	  {
	    	    		temp=temp.next;
	    	    	  }
	    	    	  System.out.println("enter the data");
	    	    	  insertpos(temp,nav.nextInt());
	    	      }
	    	}
	    }
   }
}
