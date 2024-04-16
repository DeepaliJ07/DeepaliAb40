package BasicAutomationTestClass;

//Sequence of execution: 1.SIB, 2.Main_method 3.IIB 4.Constructor

public class SIB_IIB_Constructor_mainMethod 
{

	static   //SIB
	{
		System.out.println("SIB method execute");
	}
		
	SIB_IIB_Constructor_mainMethod()  //Constructor--need object creation
	{
		System.out.println("Constructor execute");
	}
	
	{       //IIB--need object creation
		System.out.println("IIB method execute");
	}
	
	public static void main(String[] args)   //Main method
	{
		System.out.println("Main method starts");
		SIB_IIB_Constructor_mainMethod s1=new SIB_IIB_Constructor_mainMethod();

	}
}
