package AccessSpecifier;
//private metho will not be accessible Within Package


public class AccessSpecifierWithinPackage 
{

	public static void main(String[] args) 
	{
		AccessSpecifierWithinClass d1=new AccessSpecifierWithinClass();
		
		d1.protectedmethod();
		d1.publicmethod();
		d1.defaultPackagemethod();

	}

}
