
//Program to copy an array into another array
package Arrays;

import java.util.Arrays;

public class CopyArrayToAnotherArray 
{
	public static void main(String[] args)
	{
		int[] Arry=new int[5];
		Arry[0]=10;
		Arry[1]=15;
		Arry[2]=2;
		Arry[3]=8;
		Arry[4]=5;
		
		int[] copy=new int[5];
		
		for(int i=0;i<Arry.length;i++)
		{
			copy[i]=Arry[i];
		}
		System.out.println("Given Array is : " +Arrays.toString(Arry));
		System.out.println("Copied Array is : " +Arrays.toString(copy));
		
		
	}

}
