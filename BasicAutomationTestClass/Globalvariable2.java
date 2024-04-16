package BasicAutomationTestClass;
// Global variables can be static and non static
public class Globalvariable2 
{
	static int age;   //byte, short, int, long
	static double number;
	static float decimalnumber;
	static String name;
	static boolean answer;
	 		char a;    //non-static , this can be accessed by creating object
		
public static void main(String[] args)
{
	System.out.println(age);  //can be utilized even if its not initialized
	System.out.println(number);
	System.out.println(decimalnumber);
	System.out.println(name);
	System.out.println(answer);
	Globalvariable2 g1=new Globalvariable2();
	System.out.println(g1.a);    //char does NOT have any default value, so nothing is displayed for thi
	g1.a = 'd';
	System.out.println(g1.a);
			

}
}
