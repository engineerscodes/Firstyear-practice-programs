/*  BY-M.NAVEEN
 *  engineerscodes
 *  code -Program for array rotation
 *  sr.code-Ar2 
 *  moves  zeros to end of the array
 *  */
import java.util.*;
public class reverse_an_array   // class name 
{   static Scanner nav=new Scanner(System.in);// calling Scanner and creating object nav
    static int array[],size,temp;  // class instances variables
    public reverse_an_array(int c) // constructor 
    {   size=c;
    	array= new int[size]; //intialization of variables 
    }
	public static void reverse()  //method to reverse the array
	{
    for(int i=0;i<size/2;i++)   // i<size/2 this must ,if i<=size than it will again give youn samw array
    {
    	temp=array[i];
    	array[i]=array[size-1-i];
    	array[size-1-i]=temp;
    }
    System.out.println("the rever of the array"+Arrays.toString(array));
	}
	public static void input()  // method to enter element in array
	   {
	   	for(int i=0;i<size;i++)
	   		array[i]=nav.nextInt();
	    System.out.println("elements of  array"+Arrays.toString(array));
	    reverse();
	    
	   }
	public static void main(String arg[]) // main method 
	{
		System.out.println("enter the size of the array");
		reverse_an_array n=new  reverse_an_array(nav.nextInt());
		System.out.println("Enter the element of array");
		input();
	}

}
