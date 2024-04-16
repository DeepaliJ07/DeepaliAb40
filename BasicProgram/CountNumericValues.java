package BasicProgram;

import java.util.Arrays;

public class CountNumericValues
{
public static void main(String[] args) 
{
	String name="Shravani0422 hi123";
	int count_numeric=0;
	char[] ab=name.toCharArray();
	
	
	System.out.println(Arrays.toString(ab));
	for(int i=0;i<name.length();i++)
	{
		Character.isDigit(ab[i]);
		if (Character.isDigit(ab[i])==true)
		{
			count_numeric++;
		}
		
	}
	System.out.println("Number of numeric values in the given string are: " +count_numeric);
	
}
}
