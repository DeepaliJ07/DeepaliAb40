//program to execute the Scanner class with all the methods using Global Variables 

//Add only one scanner class and do operation for all 5 methods (add/sub/mul/div/mod) using global variable

package Assignments;

import java.util.Scanner;
public class ScannerClassUsingGlobalVar_8
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s1.nextInt();
		System.out.println("Enter second number");
		int b=s1.nextInt();
		
		System.out.println("Addition is " +(a+b));
		System.out.println("Subtraction is " +(a-b));
		System.out.println("Multiplication is " +(a*b));
		System.out.println("Division is " +(a/b));
		System.out.println("Modulus is " +(a%b));
		
	}
}
