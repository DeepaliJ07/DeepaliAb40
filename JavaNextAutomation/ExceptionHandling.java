package JavaNextAutomation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling
{
	public static void main(String[] args)
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			int c=1/s1.nextInt();  // try with different datatype
			System.out.println("Try block execution");
		}
		
		
		catch(ArithmeticException a1)
		{
			System.out.println("Arithmetic Exception found");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Input Mismatch exception found");
		}
		catch(NullPointerException a3)
		{
			System.out.println("Null Pointer exception found");
		}
		catch(ArrayIndexOutOfBoundsException a4)
		{
			System.out.println("Array Index Out of Bounds Exception found");
		}
		
		finally
		{
			System.out.println("Common points after execution");
		}
		
	}

}
