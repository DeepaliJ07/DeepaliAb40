package BasicProgram;

import java.util.Arrays;

public class CheckAlphabet
{
	public static void main(String[] args) 
	{
		String input="Hey I am f9. you are G8";
		int count_alphabet=0;
		int count_digit=0;
		
		char[] d1=input.toCharArray();
	
		System.out.println(Arrays.toString(d1));
		
		for(int i=0;i<input.length();i++)
		{
			Character.isAlphabetic(d1[i]);
			if(Character.isAlphabetic(d1[i])==true)
			{
				System.out.println("Alphabet "+d1[i] + " is present at index " +i);
				count_alphabet++;
			}
		}
		System.out.println("Number of Alphabets : " +count_alphabet);
		System.out.println("********************************************");
		for (int j=0;j<input.length();j++)
		{
			Character.isDigit(d1[j]);
			if(Character.isDigit(d1[j])==true)
			{
				System.out.println("Digit "+d1[j] + " is present at index " +j);
				count_digit++;
			}
		}
		System.out.println("Number of digits : " +count_digit);
		
		
		
		
		
		
	}
	
}
