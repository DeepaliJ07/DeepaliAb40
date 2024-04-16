//Create a Array of length 5 & int datatype & Store value in it using scanner class
package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_UsingScanner_20_2 
{
	public static void main(String[] args)
	{

		Scanner s1=new Scanner(System.in);
		int[] number=new int[5];

		for (int i=0;i<number.length;i++)
		{
			number[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(number));


	}
}
