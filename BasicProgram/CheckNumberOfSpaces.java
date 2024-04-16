package BasicProgram;

import java.util.Arrays;

public class CheckNumberOfSpaces
{
	public static void main(String[] args)
	{
		String a1="Hey what are you doing? Lets go there";
		int Count_space=0;

		char[] ch1=a1.toCharArray();

		System.out.println(Arrays.toString(ch1));

		for(int i=0;i<a1.length();i++) 
		{
			Character.isSpaceChar(ch1[i]);
			if(Character.isSpaceChar(ch1[i])==true)
			{
				Count_space++;
			}

		}
		System.out.println("**************************************************");
		System.out.println("Number of spaces in given string is : " +Count_space);

	}
}
