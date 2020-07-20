/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList_seperate odd and even using key of the node 
 *  list=1-->2-->3-->4-->5-->6
 *  odd_list=1-->3-->5
 *  even_list=2-->4-->6
 *  sr.code-LL5
 *  */
import java.util.*;
public class segregate_list                               //class name
{  static Scanner nav=new Scanner(System.in);            // calling Scanner and creating object nav
   static node head,evenh,oldh;                         //object of node class
   public segregate_list()                             // constructor of class segregate
  	{
  		head=evenh=oldh=null;                        //initialization head&evenh&oldh=null
  	}
   public static class node                        //second class node
   {
	   node next;                               
	   int data;
	   node(int data)                          // constructor of class node
	   {
		   this.data=data;                   //initialization of instances variable of class node using this()
		   next=null;                       //initialization of next to null
	   }
	   
   }
   public static void add(int new_data) //insert at begin
   {
	   node new_node=new node(new_data);
	   new_node.next=head;
	   head=new_node;
	   
   }
   public static void sep()    //method to seperate odd or even 
   {
	   if(head==null)
	   {
		   System.out.println("List is empty ");
		   return;
	   }
	   node dis=head;
	   while(dis!=null)
	   {
		   if((dis.data)%2==0) // node.data==even the then data is passed to even head
		   {
			   node temp=new node(dis.data);
			   temp.next=evenh;
			   evenh=temp;
		   }
		   else
		   {
			   node temp=new node(dis.data); // node.data==even the then data is passed to odd head
			   temp.next=oldh;
			   oldh=temp;
		   }
		   dis=dis.next;
	   }
   }
   
   public static void display()  //method to display linkedlist
   {   
	   if(evenh==null)
	   {   System.out.println("even list is empty");
		   return;
	   }
	   if(oldh==null)
	   { System.out.println("odd list is empty");
	   return;	   
	   }
	   System.out.println("even list");
	   node c=evenh;
	   while(c!=null)
	   {
		   System.out.print(c.data+" ,");
		   c=c.next;
	   }
	   System.out.println("\n odd list");
	    c=oldh;
	   while(c!=null)
	   {
		   System.out.print(c.data+" ,");
		   c=c.next;
	   }
   }
  
public static void main(String arg[])  //main method
{
	segregate_list n=new segregate_list(); //calling constructor of the class segregate_list
	/*This program is only for sorting a linkedlist 
     * So,I have directly given values in add fuction u can edit this my caliing add function and adding values at runtime 
     * For futhure information plz check r singllyLinkeList program and DoubllyLinkedlist code in Git
     * 
     * */
	add(10);
	add(11);
	add(44);
	add(5);
	add(0);
	add(1999);
	add(1);
	sep();
	display();
}
}
