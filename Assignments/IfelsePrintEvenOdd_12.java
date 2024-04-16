//From 1 to 100, print Even and Odd numbers using if else
package Assignments;

public class IfelsePrintEvenOdd_12 
{
	public static void main(String[] args)
	{
		System.out.println("Even numbers :");
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers :");
		for(int j=0;j<=100;j++)
		{
			if(!((j%2)==0))
			{
				System.out.println(j);
			}
		}
	}
}