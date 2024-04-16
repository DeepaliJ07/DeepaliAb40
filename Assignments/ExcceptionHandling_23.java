package Assignments;

import java.util.Arrays;

public class ExcceptionHandling_23
{
public static void main(String[] args)
{
	try
	{
		System.out.println("Start ----Hello World");
		int[] ab=new int[3];
		ab[0]=11;      
		ab[1]=12;
		ab[2]=44;
		ab[3]=5;
  		System.out.println(Arrays.toString(ab));
		
		System.out.println("Hello World");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndex Out Of Bounds Exception occured");
	}
	
}
}
