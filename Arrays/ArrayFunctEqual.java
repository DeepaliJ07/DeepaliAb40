package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayFunctEqual
{
	public static void main(String[] args)
	{
		int[] num=new int[2];
		num[0]=5;
		num[1]=78;
		
		int[] number=new int[2];
		number[0]=5;
		number[1]=78;
		
		boolean a=Arrays.equals(num, number);  //verify the array type return type 
		System.out.println(a);

	}
}
