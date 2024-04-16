package JavaNextAutomation;

interface abc
{
	void abc_meth1();
	void xyz_meth2();  //here no access specifier
}


public class InterfaceClass implements abc
{
	static void new1()
	{
		System.out.println("Static method inside class");
	}
	public static void main(String[] args) 
	{
		new1();
		InterfaceClass d1=new InterfaceClass();
		d1.abc_meth1();
		d1.xyz_meth2();

	}
	@Override
	public void abc_meth1()
	{
		System.out.println("interface method abc_meth1");

	}


	@Override
	public void xyz_meth2() 
	{
		System.out.println("interface method xyz_meth2");	
	}

}
