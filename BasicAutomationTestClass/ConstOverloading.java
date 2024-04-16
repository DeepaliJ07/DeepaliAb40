// Constructor are always non-static, 
package BasicAutomationTestClass;

public class ConstOverloading
{
	ConstOverloading(int a,int b)
	{
		System.out.println("One");
	}
	
	ConstOverloading(double a)
	{
		System.out.println("Two");
	}
	ConstOverloading()
	{
		System.out.println("Three");
	}
	
	
public static void main(String[] args) 
{
	ConstOverloading a1=new ConstOverloading();
	ConstOverloading a2=new ConstOverloading(23.23);
	ConstOverloading a3=new ConstOverloading(2,4);
	
}
}
