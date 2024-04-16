package BasicAutomationTestClass;

import java.util.Scanner;

public class ScannerAccessAllMethods 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter integer value");
		int a=s1.nextInt();
		System.out.println("Enter byte value");
		byte b=s1.nextByte();
		System.out.println("Enter short value");
		short c=s1.nextShort();
		System.out.println("Enter long value");
		long d=s1.nextLong();

		System.out.println("Enter float value");
		float e=s1.nextFloat();
		System.out.println("Enter double value");
		double f=s1.nextDouble();

		System.out.println("Enter boolean value");
		boolean g =s1.nextBoolean();

		s1.close();
	}
}

//******* we dont have anything for CHAR *** remember this
//If we enter any wrong datatype value then it gives error as InputMismatchExpection