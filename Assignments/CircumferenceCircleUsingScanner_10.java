/*Find the Circumference of the Circle having 'pi' as static, final and Global 
 and r via Scanner class*/
package Assignments;

import java.util.Scanner;

public class CircumferenceCircleUsingScanner_10
{
	final static double pi=3.14;

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius :");
		double r=s1.nextDouble();
		System.out.println("Circumference of circle is :" +(2*pi*r));

	}
}
