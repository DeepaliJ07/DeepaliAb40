/*Write program for the order of execution of SIB, IIB, Constructor and main method
but create the object twice and verify the output
####Sequence of execution: 1.SIB, 2.Main_method 3.IIB 4.Constructor
*/
package Assignments;
public class SIB_IIB_Constructor_mainMethod_6 
{

	static   //SIB
	{
		System.out.println("SIB method execute");
	}
		
	SIB_IIB_Constructor_mainMethod_6()  //Constructor
	{
		System.out.println("Constructor execute");
	}
	
	{       //IIB
		System.out.println("IIB method execute");
	}
	
	public static void main(String[] args)   //Main method
	{
		System.out.println("Main method starts");
		SIB_IIB_Constructor_mainMethod_6 s1=new SIB_IIB_Constructor_mainMethod_6();
		SIB_IIB_Constructor_mainMethod_6 s2=new SIB_IIB_Constructor_mainMethod_6();

	}
}
