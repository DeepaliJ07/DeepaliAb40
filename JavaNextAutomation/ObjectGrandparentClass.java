package JavaNextAutomation;

class GrandParentObject extends Object
{
	void add()
	{
		System.out.println("GrandParent class");
	}
}




public class ObjectGrandparentClass extends GrandParentObject
{
	public static void main(String[] args) 
	{
		ObjectGrandparentClass v1=new ObjectGrandparentClass();
		System.out.println(v1.getClass());
		
	}

}
