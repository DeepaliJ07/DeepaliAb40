package BasicAutomationTestClass;

public class IIB_Class 
{

	{        //Since is non-static, we ned to create object first
		System.out.println("IIB method One");
	}
	
	{
		System.out.println("IIB method One");
	}
	
	{
		System.out.println("IIB method One");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		IIB_Class b1=new IIB_Class();  
		//Single object creation will call all the IIB methods, no need to create separate object for each
		//As object created, IIB methods be will executed sequentially
	System.out.println("Main method ends");
	}
}
