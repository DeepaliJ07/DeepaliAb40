package JavaNextAutomation;
//can access GrandParent and Parent class methods
//but not access Child class methods

class GrandParentUpcasting
{
	void country()
	{
		System.out.println("GrandParent Class");
	}
}

class ParentUpcasting extends GrandParentUpcasting
{
	void state()
	{
		System.out.println("Parent Class");
	}
}

public class UpcastingClassChildWithGrandParent extends ParentUpcasting
{
	void district()
	{
		System.out.println("Child Class");
	}
	
	public static void main(String[] args)
	{
		
		ParentUpcasting q1=new UpcastingClassChildWithGrandParent();
		q1.country();
		q1.state();
		
		
	}

}
