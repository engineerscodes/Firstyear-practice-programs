/*  BY-M.NAVEEN
 *  engineerscodes
 *  code -Program for array rotation search
 *  sr.code-Ar5
 * 
 *  */
import java .util.*;
public class rotatesearch // class name
{
    static Scanner nav=new Scanner(System.in);  // calling Scanner and creating object nav
    static int a[],size,element,count=0,flag=0; // class instances variables
	public rotatesearch(int c)  // constructor 
	{    size=c;
		a=new int[size];  //intialization of variables  
	}
	
	public static void  rsearch() //method to do right_rotation and then search 
	{  int temp=a[0]; 
	   for(int i=1;i<size;++i) //rotation by 1 index
	   {
		   a[i-1]=a[i];
		  
	   }
	   count++;
	   a[size-1]=temp;
	   System.out.println(Arrays.toString(a));
	   if (a[0]==element)  //search at the position zero if element is present  
	   {
		   flag=1;
		   return;
		  
	   }
	   if(count==size)  //if count is equal to size then return to main because u allready traversed whole array
	   {
		  return; 
	   }
	   else 
		   rsearch();  //recursive call
	
	}
	 public static void input() //array input method
	   {
	   	for(int i=0;i<a.length;i++)
	   		a[i]=nav.nextInt();
	   	System.out.println("element in array are::"+Arrays.toString(a));
	   	System.out.println("enter value to find value");
	   	element=nav.nextInt();
	    rsearch();
	   	if(flag==0)
	   		System.out.println("element is not found in array");	
	   	else 
	   		System.out.println("element is found in array");
	   }
public static void main(String arg[])  //main method
{
	System.out.println("enter the size of the array");
	rotatesearch n=new  rotatesearch(nav.nextInt());
	System.out.println("Enter the element of array");
	input();  //input method
}
}
