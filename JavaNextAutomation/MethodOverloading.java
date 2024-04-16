package JavaNextAutomation;

public class MethodOverloading 
{
	void add()
	{
		System.out.println("method overloading");
	}
	void add(int a)
	{
		System.out.println(a);
	}
	void add(int a, double b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void add(String a, int b, double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
public static void main(String[] args)
{
add("hello",6,12.5); //can be called directly as its static
MethodOverloading e1=new MethodOverloading();
e1.add();
e1.add(5);
e1.add(6, 7.990);

}
}
