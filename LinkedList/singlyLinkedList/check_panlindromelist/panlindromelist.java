/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList to check is panlindrome or not 
 *  list=1-->2-->3-->3-->2-->1
 *  This panlindrome
 *  sr.code-LL6
 *  */
import java.util.*;
public class panlindromelist                                   //class name
{  static Scanner nav=new Scanner(System.in);                 // calling Scanner and creating object nav
   static node head;                                         //object of node class
	public panlindromelist()                                // constructor of class panlindromelist
	{
		head=null;                                        //initialization head=null
	}
	
	public static class node                           //second class node
	{
		node next;
		int data;
		node(int data)                             // constructor of class node
		{ this.data=data;                         //initialization of instances variable of class node using this()
		   next=null;                            //initialization of next to null
			
		}
	}
	
	public static void add(int new_data) //method to insert in list
	{ node new_node=new node(new_data);
	  if(head==null)	
	  { head=new_node;
	  return;
	  }
	  new_node.next=head;
	  head=new_node;
	  
	}
	public static void checkp() //method to check is list is panlindrome
	{   int i=0,flag=1;
		int a[];
		node last=head;
		while(last!=null)
		{
			last=last.next;
			i++;
		}
		a=new int[i];  //temp array to store values of list and cjeck if it's a panlindrome
		int j=0;
		node last1=head;
		while(last1!=null)
		{    a[j++]=last1.data;  //assign the value to the array
			last1=last1.next;
		}
		System.out.println(Arrays.toString(a));
		for(int c=0,k=i-1;c<i/2;c++,k--)    //checking if array is panlindrome
		{
			if(a[c]!=a[k])
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("Is panlindrome");
		else
			System.out.println("Is not  panlindrome");
	}
	public static void main(String arg[]) //main method
	{   panlindromelist n=new panlindromelist(); //constructor of class panlindromelist
		System.out.println("LINKED List");
		/*This program is only for panlindromelist  a linkedlist 
	     * So,I have directly given values in add fuction u can edit this my caliing add function and adding values at runtime 
	     * For futhure information plz check r singllyLinkeList program and DoubllyLinkedlist code in Git
	     * 
	     * */
		add(1);
		add(5);
		add(1);
		add(0);
		add(1);
		checkp();
	}

}
