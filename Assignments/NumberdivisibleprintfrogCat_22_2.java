package Assignments;

import java.util.Scanner;
public class NumberdivisibleprintfrogCat_22_2
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the number");
		int number=s1.nextInt();
		if(number%3==0)
		{
			System.out.println("Frog");
		}
		if(number%5==0)
		{
			System.out.println("Cat");
		}
		if(number%3==0 && number%5==0)
		{
			System.out.println("Frog and Cat");
		}	
	}
}
