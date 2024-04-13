package Assignments;

import java.util.Scanner;

public class Pallindrome_17
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	String input=s1.next();
	//String input="Ram";
	String output="";

	for(int i=input.length()-1;i>=0;i--)
	{
		output=output+ input.charAt(i);
		
	}
	System.out.println("reverse of given input is: "+output);
	if(input.equals(output))
	{
		System.out.println("String is Pallindrome");
	}
	else
	{
		System.out.println("String is NOT a Pallindrome");
	}
}
}
