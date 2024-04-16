//Assignment 3 - Create 4 static method to perform arithmetic operations and call it inside the main method.
package Assignments;
public class StaticMethodsArithmeticOperation_3
{
	static void add()
	{
		int a=10;
		int b=5;
		System.out.println(a+b);
	}
	static void sub()
	{
		int a=10;
		int b=5;
		System.out.println(a-b);
	}
	static void mul()
	{
		int a=10;
		int b=5;
		System.out.println(a*b);
	}
	static void div()
	{
		int a=10;
		int b=5;
		System.out.println(a/b);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}
}
