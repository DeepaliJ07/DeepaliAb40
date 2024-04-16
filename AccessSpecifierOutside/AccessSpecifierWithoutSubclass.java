package AccessSpecifierOutside;
//Can access only public methods
import AccessSpecifier.AccessSpecifierWithinClass;

public class AccessSpecifierWithoutSubclass 
{
	public static void main(String[] args) 
	{
		AccessSpecifierWithinClass s1=new AccessSpecifierWithinClass();
		
		s1.publicmethod();
	
		
	}

}
