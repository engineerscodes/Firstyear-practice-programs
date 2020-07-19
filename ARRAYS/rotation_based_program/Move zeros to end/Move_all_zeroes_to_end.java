import java.util.*;
public class Move_all_zeroes_to_end 
{   static Scanner nav=new Scanner(System.in);
    static int array[],t[],size,temp,count;
	public Move_all_zeroes_to_end(int c) 
	{
	    size=c;
	    array=new int[size];
	    t=new int[size];
	    count=size-1;
	}
	
	public static void move()
	{  int j=0;
		for(int i=0;i<size;i++)
		{
			if(array[i]!=0)
				t[j++]=array[i];
		}
		///for( ;j<size;j++)// This is not needed because when array is initialization all element are zero
		////	t[j]=0;// so the element at last are zeros
		array=t.clone();
		//System.arraycopy(t,0,array,0,size);//can use clone fuction also array=t.clone()
		//array=t; can use this to but this will reference t and array so,the changes in t will reflect array[];
		System.out.println(" After moving zeros "+Arrays.toString(array));
		
	}
	
	 public static void input()
	   {
	   	for(int i=0;i<array.length;i++)
	   		array[i]=nav.nextInt();
	   	System.out.println("element in array are::"+Arrays.toString(array));
	   	move();
	   }
	   public static void main(String arg[])
	   {
	   	System.out.println("enter the size of the array");
	   	Move_all_zeroes_to_end  n=new Move_all_zeroes_to_end  (nav.nextInt());
	   	System.out.println("Enter the element of array");
	   	input();
	   }

}
