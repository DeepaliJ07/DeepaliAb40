package Arrays;

import java.util.Arrays;

public class IntIndexInArrays 
{
public static void main(String[] args) 
{
	int age[]=new int[5];
	age[0]=5;
	age[1]=22;
	age[2]=27;
	age[3]=33;
	age[4]=11;
	//age[5]=8;
	
	for(int i=0;i<=4;i++)
	{
	System.out.println(age[i]);
	}
	
	System.out.println("Other way to print values in Array :");
	System.out.println(Arrays.toString(age));
}
}
