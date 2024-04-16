package JavaNextAutomation;

public class ThisCallingStatement 
{
	ThisCallingStatement(int a)
	{
		this('A');
		System.out.println("Constructor 1");
	}
	ThisCallingStatement(char a)
	{
		this("Vaishu");
		System.out.println("Constructor 2");
	}
	ThisCallingStatement(String b)
	{
		this(true);
		System.out.println("Constructor 3");
	}
	ThisCallingStatement(boolean a)
	{
		this(5,true,"Hello");
		System.out.println("Constructor 4");
	}
	ThisCallingStatement(int a, boolean b, String c)
	{
		System.out.println("Constructor 5");
	}
	public static void main(String[] args)
	{
		ThisCallingStatement a1=new ThisCallingStatement(true);
		//change parameter in this object creation and verify
	}
}
