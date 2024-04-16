package Arrays;
import java.util.*;
public class ArraySort
{
	public static void main(String[] args) 
	{
		int[] a=new int[3];
		a[0]=12;
		a[1]=3;
		a[2]=8;

		Arrays.sort(a);
		for (int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(a));
	}
}
