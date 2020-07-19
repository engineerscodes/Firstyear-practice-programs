/*  BY-M.NAVEEN
 *  engineerscodes
 *  code-sum of each rotation
 *  sr.code-Ar7
 *
 *  */
import java.util.*;
public class sumofallrotation // class name
{
    static Scanner nav=new Scanner(System.in);  // calling Scanner and creating object nav
    static int array[],size,sum,highest=0,count=0,pos;  // class instances variables
	public sumofallrotation (int c) // constructor
	{
		size=c;
		array=new int[size]; //intialization of variables
	}
	
   public static void  rotation() //method to do right_rotation 
   {
	  int temp=array[size-1];
	  for(int i=size-2;i>=0;i--)
	  {
		  array[i+1]=array[i];
	  }
	  array[0]=temp;
	  System.out.println("after rotation element in array are::"+Arrays.toString(array));
	  sum();
   }
  public static void sum()  //Find  value of each rotation  Sum( i*arr[i]) with only rotations on given
  {    count++;
       sum=0;   //sum must be initizated to zero
	  for(int i=0;i<size;i++)
	  { sum=sum+(i*array[i]);
		
	  }
	  System.out.println(" sum of i*a[t] is "+sum+" when rotated by "+count);
		
	    if(highest<=sum)
	    	{highest=sum;
	    	pos=count;
	    	}
	    if(count==size)
	    {
	    	return;
	    }
	    else
	    	rotation();  //recursive call
  }

  public static void input() //array input method
  {
  	for(int i=0;i<array.length;i++)
  		array[i]=nav.nextInt();
  	System.out.println("element in array are::"+Arrays.toString(array));
  	rotation();
  }
  public static void main(String arg[]) //main method
	{
		System.out.println("enter the size of the array");
		sumofallrotation  n=new sumofallrotation  (nav.nextInt());
		System.out.println("Enter the element of array");
		input();
		System.out.println("the highest sum of i*a[t] is "+highest+" when rotated by "+count);
		
}
}
