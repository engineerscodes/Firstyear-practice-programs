
/*  BY-M.NAVEEN
 *  engineerscodes
 *  code -Program for array rotation
 *  sr.code-Ar2
 *  moves  zeros to end of the array
 *  */
import java.util.*;
public class Move_all_zeroes_to_end  // class name 
{   static Scanner nav=new Scanner(System.in);  // calling Scanner and creating object nav
    static int array[],t[],size;  // class instances variables 
	public Move_all_zeroes_to_end(int c) // constructor 
	{
	    size=c;
	    array=new int[size]; //intialization of variables  
	    t=new int[size];
	}
	
	public static void move() //method to move zero 
	{  int j=0;
		for(int i=0;i<size;i++)  // finding zeros in array
		{
			if(array[i]!=0)  //if array element is not equal then the elements is write in temp array(t)
				t[j++]=array[i]; 
		}
		///for( ;j<size;j++)// This is not needed because when array is initialization all element are zero
		////	t[j]=0;// so the element at last are zeros
		array=t.clone();
		//System.arraycopy(t,0,array,0,size);//can use clone fuction also array=t.clone()
		//array=t; can use this to but this will reference t and array so,the changes in t will reflect array[];
		System.out.println(" After moving zeros "+Arrays.toString(array)); //printing array  After moving zeros
		
	}
	
	 public static void input()  // method to enter element in array
	   {
	   	for(int i=0;i<array.length;i++)
	   		array[i]=nav.nextInt();
	   	System.out.println("element in array are::"+Arrays.toString(array));
	   	move(); //calling move method
	   }
	   public static void main(String arg[]) // main method 
	   {
	   	System.out.println("enter the size of the array");
	   	Move_all_zeroes_to_end  n=new Move_all_zeroes_to_end  (nav.nextInt());
	   	System.out.println("Enter the element of array");
	   	input();  // calling input method
	   }

}
