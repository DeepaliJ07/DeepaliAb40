package Assignments;

import java.util.Arrays;

public class ArrayStringConsistOnlyAlpha_21_1
{
	public static void main(String[] args) 
	{
		String input="HelloWorld";
		int count_alpha=0;
		
		char[] ch=input.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<input.length();i++)
		{
			boolean b=Character.isAlphabetic(ch[i]);
			if(b==true)
			{
				count_alpha++;
			}	
		}
		System.out.println("number of alphabets in given string are" +count_alpha);
		if(count_alpha==ch.length)
		{
			System.out.println("String consist of only Alphabets");
		}
		else
		{
			System.out.println("String consist of Alphabets/numeric or special character");
		}
		
	}

}
