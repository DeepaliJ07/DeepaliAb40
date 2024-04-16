package Assignments;

import java.util.Arrays;

public class ArrayStringConsistOnlyDigit_21_2 
{
	public static void main(String[] args) 
	{
		String input="12345hey";
		int count_digit=0;
		
		char[] ch=input.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<input.length();i++)
		{
			boolean b=Character.isDigit(ch[i]);
			if(b==true)
			{
				count_digit++;
			}	
		}
		System.out.println("number of digits in given string are: " +count_digit);
		if(count_digit==ch.length)
		{
			System.out.println("String consist of only digits");
		}
		else
		{
			System.out.println("String consist of Alphabets,digits or special character");
		}
		
	}

}
