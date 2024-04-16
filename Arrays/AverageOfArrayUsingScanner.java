package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArrayUsingScanner 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size= s1.nextInt();
		System.out.println("Enter the values in array");
		int[] number=new int[size];
		int sum=0;
		for (int i=0;i<size;i++)
		{
			Scanner s2=new Scanner(System.in);
			number[i]=s2.nextInt();
			
		}
		
		System.out.println(Arrays.toString(number));
		
		for(int j=0;j<number.length;j++)
		{
			sum=sum + number[j];
		}
		int average= sum/number.length;
		System.out.println("Average of given numbers is : " +average);
		
	}

}
