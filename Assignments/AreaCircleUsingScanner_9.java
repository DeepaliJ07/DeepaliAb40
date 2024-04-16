/*Find the Area of the Circle having 'pi' as static, final and Global 
with int radius and double radius using Scanner class */

package Assignments;

import java.util.Scanner;

public class AreaCircleUsingScanner_9 
{
	final static double pi=3.14;


	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int r1= s1.nextInt();
		System.out.println("Area of circle using r as int datatype:");
		System.out.println( pi*r1*r1);

		double r2= s1.nextDouble();
		System.out.println("Area of circle using r as double datatype:");
		System.out.println( pi*r2*r2);
	}
}
