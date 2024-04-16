package AccessSpecifier;

//ALL methods are accessible within the Class

public class AccessSpecifierWithinClass
{
	private void privatemethod()
	{
		System.out.println("private method accessible"); 
	}
	
	protected void protectedmethod()
	{
		System.out.println("protected method accessible");
	}
	
	public void publicmethod()
	{
		System.out.println("Public methods accessible");
	}
	void defaultPackagemethod()
	{
		System.out.println("Package and default methods accessible");
	}
	
	
	public static void main(String[] args)
	{
		AccessSpecifierWithinClass a1=new AccessSpecifierWithinClass();
		
		a1.privatemethod();
		a1.protectedmethod();
		a1.publicmethod();
		a1.defaultPackagemethod();
		
	}

}
