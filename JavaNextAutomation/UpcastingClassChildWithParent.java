package JavaNextAutomation;
//In case of upcasting, we can only access parent class method and 
//Child Class methods are NOT accessible
class UpcastingParent
{
	void add()
	{
		System.out.println("Parent Class method");
	}
}


public class UpcastingClassChildWithParent extends UpcastingParent
{
	void sub()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args)
	{
		
		UpcastingParent	 p1= new UpcastingClassChildWithParent();
		p1.add();
	}

}
