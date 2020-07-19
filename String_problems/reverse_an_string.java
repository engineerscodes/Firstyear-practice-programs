
/*  BY-M.NAVEEN
 *  engineerscodes
 *  code-reverse a string
 *  sr.code-St1
 *
 *  */
import java.util.Arrays;
import java.util.*;
public class reverse_an_string  //class name
{   static Scanner nav=new Scanner(System.in);// calling Scanner and creating object nav
    static String array[],str,ch; // class instances variables
    static int size;
	public reverse_an_string() // constructor
	{
		size=array.length;//intialization of variables 
	}
	public static void reverse()  //method to reverse String array
	{
		for(int i=0;i<size/2;i++)
		{
			ch=array[i];
			array[i]=array[size-1-i];
			array[size-1-i]=ch;
			
		}
		System.out.println(" reverse array --"+Arrays.toString(array));
		print();
	}
	public static  void print()  //method to display
	{   System.out.println("element in array-");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+array[i]);	
		}
	}
	public static void main(String arg[]) //main mathod
	{
		System.out.println("Enter the the string");
		str=nav.nextLine();
		System.out.println(" string  -"+str);
		array=str.split("");
		reverse_an_string n=new reverse_an_string();
		reverse();
	}

}
