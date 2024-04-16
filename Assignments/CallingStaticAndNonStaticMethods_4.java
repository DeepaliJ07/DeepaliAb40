/*Assignment 4 - create 5 static method and 5 non static method and call it inside main method */

package Assignments;
public class CallingStaticAndNonStaticMethods_4 
{
	static void add()   //static method
	{
		System.out.println("Static metod - add");
	}

	void addition()      //Non-static method
	{
		System.out.println("Non-static method - addition");
	}
	static void sub()     //static method
	{
		System.out.println("Static method - sub");
	}
	void subtraction()     //Non-static method
	{
		System.out.println("Non-Static method - subtraction");
	}
	static void mul()      //static method
	{
		System.out.println("Static method - mul");
	} 
	void multiply()        //Non-static method
	{
		System.out.println("Non-Static method - multiply");
	}
	static void div()      //static method
	{
		System.out.println("Static method - div");
	}
	void division()       //Non-static method
	{
		System.out.println("Non-Static method - division");
	}
	
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		CallingStaticAndNonStaticMethods_4 a1= new CallingStaticAndNonStaticMethods_4();
		a1.addition();
		a1.subtraction();
		a1.multiply();
		a1.division();
	}
}
