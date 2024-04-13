// Program to execute the Scanner Class with all the methods using local Variable

//Program to add 5 methods with 5 scanner class

package Assignments;
import java.util.Scanner;
public class ScannerClassEx_7 
{
	void add()
	{
		System.out.println("****Addition****");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a =s1.nextInt();
		System.out.println("Enter 2nd number:");
		int b=s1.nextInt();
		System.out.println("Sum of two numbers is: " +(a+b));
	}

	void sub()
	{
		System.out.println("****Subtraction****");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a =s1.nextInt();
		System.out.println("Enter 2nd number:");
		int b=s1.nextInt();
		System.out.println("Subtraction of two numbers is: " +(a-b));
	}

	void mul()
	{
		System.out.println("****Multiplication****");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a =s1.nextInt();
		System.out.println("Enter 2nd number:");
		int b=s1.nextInt();
		System.out.println("Multiplication of two numbers is: " +(a*b));
	}
	void div()
	{
		System.out.println("****Division****");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a =s1.nextInt();
		System.out.println("Enter 2nd number:");
		int b=s1.nextInt();
		System.out.println("Division of two numbers is: " +(a/b));
	}
	static void modulus()
	{
		System.out.println("****Modulus****");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a =s1.nextInt();
		System.out.println("Enter 2nd number:");
		int b=s1.nextInt();
		System.out.println("Modulus of two numbers is: " +(a%b));
	}


	public static void main(String[] args) 
	{
		ScannerClassEx_7 a1=new ScannerClassEx_7();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		modulus();
		

	}

}
