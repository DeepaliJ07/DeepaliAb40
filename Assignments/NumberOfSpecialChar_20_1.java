package Assignments;
import java.util.Arrays;
public class NumberOfSpecialChar_20_1
{
	public static void main(String[] args) 
	{
		String name="Manish123 $# Kumar";
		int alpha_count=0;
		int digit_count=0;
		int space_count=0;
		int specialChar_count=0;
		char[] y=name.toCharArray();
		
		System.out.println((Arrays.toString(y)));
		
		for(int i=0;i<name.length();i++)
		{
			boolean alpha =Character.isAlphabetic(y[i]);
			boolean digit=Character.isDigit(y[i]);
			boolean space=Character.isSpaceChar(y[i]);
			if(alpha==true)
			{
				alpha_count++;
			}
			else if(digit==true)
			{
				digit_count++;
			}
			else if(space==true)
			{
				space_count++;
			}
		}
		specialChar_count = (name.length())-(alpha_count+digit_count+space_count) ;
		System.out.println("Number of Special char in given string is: " +specialChar_count);
	}
}
