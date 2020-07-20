/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList sorting 
 *  sr.code-LL3
 *  */
import java.util.*;
public class sort_a_list                         //class name
{  static Scanner nav=new Scanner(System.in);   // calling Scanner and creating object nav
   static node head;                           //object of node class
   static int sort[];                         //array to sort
	public sort_a_list()                     // constructor of class sort_a_list
	{
	  head=null;	                       //initialization head=null
	}
	public static class node             //second class node
	{
		node next;
		int data;
		node(int data)               // constructor of class node
		{
			next=null;             //initialization of next  =null
			this.data=data;       //initialization of instances variable of class node using this()
		}	
	}
public static void add(int new_data)  //insert at begining of the list
{   node new_node =new node(new_data);
	if(head==null)
	{
		head=new_node;
		return;
	}
	new_node.next=head;
	head=new_node;
}
public static void count() //to count the size of the list
{ int count=0;
  node last=head;
  while(last!=null)
  {
	  last=last.next;
	  count++;
  }
  sort(count); //calling sort function after calculating size
}
public static void sort(int size) //method sort to sort linkedlist
{   sort=new int[size];
	int count=0;
	node last=head;
	  while(last!=null)
	  {   sort[count]=last.data; //assign all values of list in array
		  last=last.next;
		  count++;
	  }
	  Arrays.sort(sort);//calling java sort method to sort array you can use our own method to sort also bubblesort and ect
	 System.out.println(" sort"); 
	 System.out.print(Arrays.toString(sort)); //printing sorted array
    head=null;  //deleting  the complete list 
   for(int i=sort.length-1;i>=0;i--)//inserting to the list in sorted order 
   {
	   add(sort[i]);
   }
   //u can use this method also (below one)
  /* node temp=head; 
   head=temp;
   for(int i=sort.length-1;i>=0;i--) 
   {
	   temp.data=sort[i];
	   System.out.println(temp.data+" , ");
	   temp=temp.next;
	   
   }*/
   display();
}
public static void display()
{   node last =head;
    System.out.println(" sorted list -- ");
	while(last!=null)
	{
		System.out.print(last.data+" , ");
		last=last.next;
	}
	
}
public static void main(String args[]) //main method 
{  sort_a_list n=new sort_a_list();  //craeting object of the class sort_a_list to call constructor 
  
    System.out.print("likedlist");
    /*This program is only for sorting a linkedlist 
     * So,I have directly given values in add fuction u can edit this my caliing add function and adding values at runtime 
     * For futhure information plz check r singllyLinkeList program and DoubllyLinkedlist code in Git
     * 
     * */
	add(100);
	add(50);
	add(70);
	add(52);
	add(60);
	add(1); 
	add(12);
	add(55);
	count();
}
}
