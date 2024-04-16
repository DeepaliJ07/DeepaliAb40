//Program to print Array in reverse

package Arrays;
import java.util.Arrays;
public class PrintArrayReverse
{
	public static void main(String[] args)
	{
		int[] givenArr=new int[4];
		givenArr[0]=20;
		givenArr[1]=4;
		givenArr[2]=67;
		givenArr[3]=55;
		
		int[] rev=new int[4];
		int k=givenArr.length-1;
		
		for (int i=0;i<givenArr.length;i++)
		{
			rev[k]=givenArr[i];
			k--;
		}
		System.out.println("Given Array is : " +Arrays.toString(givenArr));
		System.out.println("Given Array is : " +Arrays.toString(rev));
		
		
	}

}
