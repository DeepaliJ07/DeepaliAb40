
//Final value cannot change its value, never. Once written its final

package BasicAutomationTestClass;

public class Finalvariable
{
	final static int a=10;
	
public static void main(String[] args)
{
	 final int b=5;   //final can used as global and local variable, BOTH
	System.out.println(a);
//	a=200; ///error if we initialize the value again
}
}
