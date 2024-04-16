//Inorder to downcasting , first upcasting is mandatory
//downcasting is mostly not used in reality

package JavaNextAutomation;
class ParentDownCasting
{
	void city()
	{
		System.out.println("Parent class");
	}
}
public class DowncastingChild extends ParentDownCasting
{
	void town()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) 
	{
		//upcasting is mandatory for doing downcasting
		ParentDownCasting s1=new DowncastingChild();
		s1.city();
		
		//downcasting can access both child and parent class methods
		DowncastingChild d1=(DowncastingChild) new ParentDownCasting();
		d1.town();
		d1.city();
		
		
	}

}
