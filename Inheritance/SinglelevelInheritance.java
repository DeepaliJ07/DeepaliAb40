package Inheritance;




class ParentClass
{
	static void add()
	{
		System.out.println("Static method-Parent class-Addition");
	}
	void sub()
	{
		System.out.println("Non-Static method-Parent class-Subtraction");
	}
}



public class SinglelevelInheritance extends ParentClass
{
	static void mul()
	{
		System.out.println("Static method-Child class-Multiply");
	}
	void div()
	{
		System.out.println("Non-Static method-Child class-Division");
	}

	public static void main(String[] args) 
	{
		mul();
		SinglelevelInheritance a1=new SinglelevelInheritance(); 
		//object creation can help to invoke methods from parent and child class both
		//Always create object of Child class and NOT of parent class
		a1.div();
		a1.add();
		a1.sub();
	}
}
