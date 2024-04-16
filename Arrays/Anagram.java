package Arrays;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String a1="sneak";
		String b1="snake";
		
		char[] a=a1.toCharArray();
		char[] b=b1.toCharArray();
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		boolean ans=Arrays.equals(a, b);
		if(ans==true)
		{
			System.out.println("Two strings are Anagram");
		}
		else
		{
			System.out.println("Two strings are NOT Anagram");
		}
		
	}
}
