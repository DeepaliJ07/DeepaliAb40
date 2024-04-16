package BasicAutomationTestClass;

public class Globalvariable1 
{
	static double pi=3.14;
	static boolean value;    //only declaration and be initialized in main method

	static void pivalue()
	{
		System.out.println(pi);   //Global variable can be accessed in any method
	}
	public static void main(String[] args)
	{
		value=false;
		System.out.println(pi);  //can be accessed as its global variable
		pivalue();    

	}
}
