/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList
 *  sr.code-LL2
 *  */
import java.util.*;
public class linked  //class name
{  static Scanner nav=new Scanner(System.in); // calling Scanner and creating object nav
   static node head;  //object of node class 

	public linked() // constructor of class linked
	{
		head=null; //intialize head=null
	}
	public static  class node  //second class node 
	   {
		   node next;
		   int  data;
		    node(int d)  // constructor of class node
		    {
		    	next=null;   //intialization of next  =null
		    	data=d;
		    }
	   }
 
	public static void  insertbegin(int new_data ) //method to insert at the begining of the list
	{  node new_node= new node( new_data);  //creating new node
	   new_node.next=head;  //assign newnodes--> next to head
	   head=new_node;	 //then assign to new__node 
	}
	
	public static void insertend(int new_data) //method to insert at the end of the list
	{ 
		node new_node =new node(new_data);  //creating new node
		node temp=head; //temp node(object of class node) to traverse till end of the list
		if(head==null)  //if list is empty 
		{
			head=new_node; //since list is empty head.next will not exist so  directly assign head=newnode
			return;
		}
		new_node.next=null; //when len(list)<1 
		while(temp.next!=null)
		{
			temp=temp.next;  //traverse till end using temp=temp--next--->
		}
		temp.next=new_node;//after reaching the end assign temp.next=new_node which was previous(temp--next-->)= null
	}
	public static void insertafterpos(node temp,int new_data)  ///method to insert after position 
	{           node new_node=new node(new_data);  //create a new node 
	            if(head==null)  //check is head.next=null or only one node is present 
	            {  head=new_node;
	            	return;
	            }
	            if(temp.next==null)//if position >len of list
	            {       
	            	insertend(new_data);
	            	return;
	            }
	            new_node.next=temp.next;
	            temp.next=new_node;
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
	public static void removefront() //deletion from front of the list
	{
		if(head==null)   // if list is empty then return
		{
			System.out.println("List is empyt");
			return;
		}
		if(head.next==null)  //if only one element is present 
		   
		{
			System.out.println("the element in list is deleted -"+head.data);
			head=null;
			return;
		}
		System.out.println("the element in list is deleted -"+head.data);
		head=head.next;  //moving head to delete the front element 
	}
	
	public static void removeend()  //deletion from end 
	{
		if(head==null)    //if list is empty
		{ System.out.println("List is empyt");
		return;
		}
		if(head.next==null)  // if only one element exist
		{
			System.out.println("the element in list is deleted -"+head.data);
			head=null;
			return;
		}
		node last=head;  //temp node to traverse till second last node  of the list
		while(last.next.next!=null)
		{
			last=last.next;
		}
		System.out.println("The element in list is deleted -"+last.next.data);
		last.next=null;  // assigning last--next-->null breaking the link
	}
	public static void removepos(int pos)  //deleteion using key
	{
		if(pos==1) //if pos is 1
		{
			removefront(); //directly remove front 
			return;
		}
		if(head==null)//if list is empty
		{	System.out.println("List is empty");
		    return;
		}
		node del=head;
	for(int i=2;i<pos;i++)
	{   
		if(del.next==null)
		{
			System.out.println("invalid position the of the list is smaller than position ");
			return;
		}
		del=del.next;
	}
	if(del.next.next==null)//deleteing last element
	{
	   removeend();	
	   return;
	}
	del.next=del.next.next;
	}
	public static int  search(int ele) //searching a element in list
	{   int count=1;
		node s=head;
		if(head==null)
		{
			return -1; //return -1 if list is empty
		}
		 while(s!=null)
		 {
			 if(s.data==ele)
			 {
				 System.out.println("element is found at position -"+count);
				 return count;//return position of node if element was found
			 }
			 count++;
			 s=s.next;
		 }
		 System.out.println("element is not found in list");
		 return -1;
	}
	public static void delete(int ele) //deletion using position
	{   int x=search(ele); //to get the element in that position
		if(x==-1)
		{
			System.out.println("The element does not exist in list -");
			return;
		}
		if(x==1)
		{
			removefront();
			return;
		}
		node last=head;
		if(head==null)
		{
			return;
		}
		for(int i=2;i<x;i++)
			last=last.next;
		if(last.next.next==null)
		{
			last.next=null;
			return;
		}
		last.next=last.next.next;
		last.next.next=null;
	}
	public static void delete_fast_key(int ele) //deletion usingn key
	{   int f=1;
		if(head==null)
		{
			System.out.println("THE list is empty");
			return;
		}
		
		if(head.data==ele)
		{    f=0;
			if(head.next==null)
		{
			head=null;
			return;
		}
			head=head.next;
			return;
		}
		node del=head;
		while(del.next!=null)
		{
			if(del.next.data==ele)
			{   f=0;
				if(del.next.next==null)
			{
				del.next=null;
				return;
			}
				del.next=del.next.next;
				del.next.next=null;
			}
			del=del.next;
		}
		if(f==1)
			System.out.println("Element does not exist in list");
	}
	public static void main(String arg[]) //main method
			{
		      System.out.println("This is a linkedlist");
		      while(true)
		      {
		    	System.out.println("\n1)insert in begining \n2)insert in end \n3)display \n4)Exit  \n5)insertafter position \n6)deletion from front \n7)deletion from end \n8)Search element in list \n9)remove by pos \n10)deletion by value \n11)deletion by node.data");
		    	switch(nav.nextInt())
		    	{
		    	case 1: System.out.print("Enter the node data");
		    	        insertbegin(nav.nextInt());
		    	        break;
		    	case 2: System.out.print("Enter the node data");
    	        insertend(nav.nextInt());
    	        break;   
		    	case 3: System.out.print("Displaying node--");
    	       display();
    	        break;
		    	case 4:System.exit(0); 
		    	case 5:System.out.print("Enter the the position you what to enter at:");
		    	int pos=nav.nextInt();
		    	if(pos==0)
		    	{	System.out.println("enter the data");
		    		insertbegin(nav.nextInt());
		    	}
		    	else
		    	{   node temp=head;
		    		for(int i=1;i<pos;i++)
		    		{   if(temp.next==null)
		    			    break;
		    			temp=temp.next;
		    		}
		    		System.out.println("enter the data");
		    		insertafterpos(temp,nav.nextInt());
		    	}
		    	break;
		    	case 6: removefront();
		    	       break;
		    	case 7: removeend();
		    	      break;
		    	case 8:System.out.println("Enter the element to search ::");
		    		search(nav.nextInt());
		    	    break;
		    	case 9:System.out.println("Enter the position to remove ::");
	    		removepos(nav.nextInt());
	    	    break;
		    	case 10:System.out.println("Enter the key to delete (search)");
		    	       delete(nav.nextInt());
		    	       break; 
		    	case 11:System.out.println("Enter the key to delete (key)")  ;
		    	       delete_fast_key(nav.nextInt());
		    	       break;
		    	}
		    }
		 }
}

