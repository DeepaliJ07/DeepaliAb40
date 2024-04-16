/*Create Multi level Inheritance using 2 Abstract classe and 1 concrete class
by creating 2 AbsMethods in Absclass1,creating 2 AbsMethods, 1 ConcreteMethod in Abssclass2, and 2 Concrete methods in Child class(Concrete class)

//Ca<----Ca<----C 
*/
package Assignments;
abstract class Ab_One
{
	abstract void ab_method1();
	abstract void ab_method2();
	void concrete1()
	{
		System.out.println("Concrete method 1");
	}
}

abstract class Ab_Two extends Ab_One
{
	abstract void ab_method3();
	abstract void ab_method4();
	void concrete2()
	{
		System.out.println("Concrete method 2");
	}
}


public class Abstract_Using_Multiheritance_16  extends Ab_Two
{
	public static void main(String[] args)
	{
		Abstract_Using_Multiheritance_16 a1=new Abstract_Using_Multiheritance_16();
		a1.concrete1();
		a1.concrete2();
		a1.ab_method1();
		a1.ab_method2();
		a1.ab_method3();
		a1.ab_method4();
	}

	@Override
	void ab_method3() 
	{
		System.out.println("Abstract method 3");
	}

	@Override
	void ab_method4() 
	{
		System.out.println("Abstract method 4");
	}

	@Override
	void ab_method1()
	{
		System.out.println("Abstract method 1");
	}

	@Override
	void ab_method2() 
	{
		System.out.println("Abstract method 2");
	}
}
