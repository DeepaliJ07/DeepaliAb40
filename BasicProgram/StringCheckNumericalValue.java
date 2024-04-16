//In a given string check the numerical value
package BasicProgram;

import java.util.Arrays;

public class StringCheckNumericalValue
{
	public static void main(String[] args) 
	{
		String name="V123aishu07";
		char[] nm=name.toCharArray();
		
		String z=Arrays.toString(nm);
		System.out.println(z);
		
		
		for(int i=0;i<name.length();i++)
		{
		boolean ans=Character.isDigit(nm[i]);
		if(ans==true)
		{
			System.out.println("Numeric value " +nm[i] + " is present at index " +i );
		}
		}
		
	}
}
