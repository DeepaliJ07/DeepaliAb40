//Multi-level inheritance - we need minimum 3 classes

package Inheritance;

class Grandparent
{
	 void username()
	{
		System.out.println("Username-Grandparent");
	}
}

class Parent extends Grandparent
{
	static void login()
	{
		System.out.println("login-Parent");
	}
}


public class MultiLevelInheritance extends Parent
{
	static void cart()
	{
		System.out.println("cart-Child_Class");
	}
	public static void main(String[] args)
	{
		cart();
		login();
		MultiLevelInheritance d1=new MultiLevelInheritance();
		//in order to access grandparent methods we stil have to create object of child class
		d1.username();

	}

}
