package JavaNextAutomation;
//only parent class cna be ABSTRACT, CHILD class can NEVER be abstract
//Abstract class can have abstract methods and concrete methods
///Abstract methods will always be Non-static
//Abstract methods need to be overridden always


abstract class Parent1
{
	abstract void login();
	abstract void registration();
	void add()   //non-static method
	{
		System.out.println("Addition is:" +Math.addExact(5, 15));
	}
	static void sub()   //static method
	{
		System.out.println("Sub is: " +Math.subtractExact(50, 5));
	}
}



public class AbstractClass extends Parent1 
{
	 void subchild() //non static method
	{
		System.out.println("Child class nonstatic method");
	}
	public static void main(String[] args)
	{
		sub();

		AbstractClass a1=new AbstractClass();
		//object created for calling non-static method
		a1.add();
		a1.login();
		a1.registration(); 
		a1.subchild();
	}

	@Override
	void login()
	{
		System.out.println("Login--Abstract method");
	}

	@Override
	void registration()
	{
		System.out.println("Registration--Abstract method");
	}
}
