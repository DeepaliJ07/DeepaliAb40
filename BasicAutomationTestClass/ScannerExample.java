package BasicAutomationTestClass;

import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args) 
	{
		int sum;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter First number :");
		int Firstnumber=s1.nextInt();

		System.out.println("Enter second number :");
		int Secondnumber=s1.nextInt();
		sum=Firstnumber+Secondnumber;
		System.out.println("Sum of these two numbers is : " +sum);
		s1.close();
	}
}
