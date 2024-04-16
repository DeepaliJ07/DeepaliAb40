package AccessSpecifierOutside;
//Only public and protected are accessible
import AccessSpecifier.AccessSpecifierWithinClass;

public class AccessSpecifierBecomingSubclass extends AccessSpecifierWithinClass
{
	public static void main(String[] args)
	{
		AccessSpecifierBecomingSubclass b1=new AccessSpecifierBecomingSubclass();
		
		b1.protectedmethod();
		b1.publicmethod();



	}

}
