package JavaNextAutomation;

class ParentClass
{
	void add()   //always non-static for overriding
	{
		System.out.println("Parent class -add class - method overriding");
	}
}



public class MethodOverriding extends ParentClass
{
	void add()      //always non-static for overriding
	{
		//super.add();
		System.out.println("Child class -add class");
		super.add();
	}
	
	public static void main(String[] args)
	{
		MethodOverriding m1=new MethodOverriding();
		m1.add();
	}
}
