package JavaNextAutomation;

class Parent
{
	Parent(int a)     //Parent constructor with argument and so need to add super in order to call this constructor
	{
		System.out.println("Parent constructor");
	}
}

public class SuperCallingExplicitly extends Parent
{
	SuperCallingExplicitly()
	{
		super(10);  //explicit super calling as its parameterized constructor in parent class
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) 
	{
		SuperCallingExplicitly a1=new SuperCallingExplicitly();
	}

}
