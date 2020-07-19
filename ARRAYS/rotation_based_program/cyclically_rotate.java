package easyq;
 /*  BY-M.NAVEEN
  *  engineerscodes
  *  code -Program for array rotation
  *  sr.code-Ar1
  *  */
import java.util.*;
public class cyclically_rotate   //class name 
{  static Scanner nav=new Scanner(System.in);
   static int array[],size;  //Declaring Variables and array 

	public cyclically_rotate(int c) 
	{
		size=c;
		array=new int[size];  //initialization of size and array
	}
   public static void rotate()  //method to roatate the array n times 
   {
	   int temp=array[0];
	   for(int i=1;i<size;i++)
		   array[i-1]=array[i];
	    array[size-1]=temp;
	    
	    System.out.println("element in array are::"+Arrays.toString(array)); //statement to print rotated array
   }
   
   
   public static void input()  //input method to take input elements in array
   {
   	for(int i=0;i<array.length;i++)
   		array[i]=nav.nextInt();
   	System.out.println("element in array are::"+Arrays.toString(array));  //To print the elements in array
   }
	
	public static void main(String arg[])   //main function to call member fuction of class 
	{
		System.out.println("enter the size of the array");
		cyclically_rotate n=new  cyclically_rotate(nav.nextInt()); //calling constructor of class cyclically_rotate 
		System.out.println("Enter the element of array");
		input();                          //calling input method
		while (true)                      //while loop to call rotate method n times at runtime 
		{
			System.out.println("enter 1)shift or 2)exit");
			switch(nav.nextInt())
			{
			case 1:rotate();    //calling rotate method
		            break;
			case 2: System.exit(0);		   //To exit the program      
			}

		}
	}
}
		
