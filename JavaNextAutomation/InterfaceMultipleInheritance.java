package JavaNextAutomation;

interface Parent11
{
	void login();
	void logout();
}

interface Parent22
{
	void registration();
}
public class InterfaceMultipleInheritance implements Parent11,Parent22
//can implement 2 or multiple interface but cannot extend 2 or multiple class
{
	public static void main(String[] args)
	{
		InterfaceMultipleInheritance b1=new InterfaceMultipleInheritance();
		b1.login();
		b1.logout();
		b1.registration();
	}
	
	@Override
	public void registration() 
	{
		System.out.println("registration");
	}
	@Override
	public void login() 
	{
		System.out.println("login");
	}
	@Override
	public void logout()
	{
		System.out.println("logout");
	}
}
