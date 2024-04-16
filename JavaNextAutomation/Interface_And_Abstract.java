package JavaNextAutomation;

interface sun
{
	void one();

}

abstract class moon implements sun
{
	abstract void two();
	static void earth()
	{
		System.out.println("Earth-static-abstract");
	}
}

public class Interface_And_Abstract  extends moon
{
	void Mars()
	{
		System.out.println("Mars-non_static-abstract");
	}
	public static void main(String[] args) 
	{
		earth();
		Interface_And_Abstract ai=new Interface_And_Abstract();
		ai.Mars();
		ai.one();
		ai.two();
		

	}
	@Override
	void two()     //public is not mentioned for abstract
	{
		
		System.out.println("Abstract class moon");
	}
	@Override
	public void one()   //public is access specifier for Interface
	{
		System.out.println("Interface sun");
		
	}
}
