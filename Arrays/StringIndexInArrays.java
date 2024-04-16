package Arrays;

import java.util.Arrays;

public class StringIndexInArrays
{
public static void main(String[] args)
{
	String name[]=new String[5];
	name[0]="Vaishu";
	name[1]="Sanvi";
	name[2]="Sanika";
	name[3]="Shravani";
	name[4]="Khushi";
	
	String name2=Arrays.toString(name);
	
	System.out.println(name2);
	
	for(int i=0; i<=4;i++)
	{
		System.out.println(name[i]);
	}
}
}
