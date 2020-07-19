
/*  BY-M.NAVEEN
 *  engineerscodes
 *  code -Program for array rotation
 *  sr.code-Ar3
 *  moves  zeros to end of the array
 *  */
import java.util.*;
public class Program_for_array_rotation  //class name 
{
    static Scanner nav=new Scanner(System.in); 
    static int array[],tem[],temr[],rotation_d; // class instances variables
    
	public Program_for_array_rotation(int size) 
	{
		array=new int[size];   //intialization of variables
		
	}
	public static void  lrotation() // method for leftrotation
	{  
		for(int i=0;i<rotation_d;i++)
			{tem[i]=array[i];   // copy the beginning elements from 0 -rotation_d(number of element to rotate) 
			System.out.println("temp rotatio _="+Arrays.toString(tem));
			}
		leftshift();// calling leftshift to move the elemts to beginining of the array
	}
	public static void  rrotation()	// method for rightrotation
	{
		for(int i=array.length-rotation_d,j=0;i<array.length;i++,j++) 
		{ temr[j]=array[i];  // copy the beginning elements from 0 -rotation_d(number of element to rotate)
		 System.out.println("temp rotatio _righ//t="+Arrays.toString(temr));
		}
		rightshift();// calling right to move the elemts to beginining of the array
		 
	}
	public static void leftshift() //shifting the elements 
	{   int count=1;
		for(int i=0;i<array.length-rotation_d;i++) // for loop to traverse across array
		{
			array[i]=array[i+rotation_d]; //shifting 
			
		}
		for(int i=array.length-1,j=tem.length-1;count<=rotation_d;i--,j--) //assigning temp array values to array back
		{
			array[i]=tem[j];
			count++;
		}
		System.out.println("After rotatio _="+Arrays.toString(array));
	}
	public static void rightshift() //shifting the elements
	{   int j=array.length-1;
		for(int i=array.length-1-rotation_d;i>=0;i--)  // for loop to traverse across array
		{
			       array[j]=array[i];//shifting 
			j--;
		}
		for(int i=0;i<rotation_d;i++) //assigning temp array values to array back
		{
			array[i]=temr[i];
			
		}
		System.out.println("After rotatio right="+Arrays.toString(array));
	}
    public static void input()  //input function
    {
    	for(int i=0;i<array.length;i++)
    		array[i]=nav.nextInt();
    	System.out.println("element in array are::"+Arrays.toString(array));
    	System.out.println("enter the rotationby");
        rotation_d=nav.nextInt();
        rotation_d=rotation_d%array.length;
        tem=new int[rotation_d];
        temr=new int[rotation_d];
    }
	
	public static void main(String arg[])  //main method 
	{
		System.out.println("enter the size of the array");
		Program_for_array_rotation n=new  Program_for_array_rotation(nav.nextInt());
		System.out.println("Enter the element of array");
		input();
		while (true)
		{
			System.out.println("enter 1)\nleft shift or 2)\nrigth shift 3>\nexit");
			switch(nav.nextInt())
			{
			case 1:lrotation();
			       break;
			case 2: rrotation();
			        break;
			case 3: System.exit(0);		        
			}

		}
		

}
}
