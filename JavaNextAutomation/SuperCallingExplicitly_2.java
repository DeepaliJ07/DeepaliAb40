//Implicit super calling 

package JavaNextAutomation;

class GrandParent
{
	public GrandParent(int g) 
	{
		System.out.println("Grandparent constructor");
	}
		
}

class Parentnew extends GrandParent
{
	public Parentnew(int a, double b) 
	{
		super(5);
		System.out.println("Parent constructor");
	}
		
}

public class SuperCallingExplicitly_2  extends Parentnew
{
	SuperCallingExplicitly_2()
	{
		super(5,3.14);
		System.out.println("Child constructor");
		//super(5,3.14);
	}
	public static void main(String[] args)
	{
		SuperCallingExplicitly_2 s1=new SuperCallingExplicitly_2();
	}
}
