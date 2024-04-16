package JavaNextAutomation;


class Mentor
{
	Mentor()   //constructor
	{
		System.out.println("Parent class- constructor");
	}

}

public class SuperCallingImplicitly extends Mentor  
// we have extends here and so parent class constructor is IMPLICITLY called
{
	SuperCallingImplicitly()
	{
		System.out.println("CHILD class- constructor");
	}

	public static void main(String[] args)
	{
		SuperCallingImplicitly s1=new SuperCallingImplicitly();
		//Only Object creation is done and then constructor can be called
	}

}
