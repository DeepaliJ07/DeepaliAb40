//Area of Circle with human input at the Run time for 10 times

package Assignments;
import java.util.Scanner;

public class AreaOfCircleUsingScanner_13
{
	static double pi=3.14;
	public static void main(String[] args)
	{
		double Area;
		for(int i=0;i<10;i++)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the radius of circle");
			double radius=s1.nextDouble();
			Area=pi*radius*radius;
			System.out.println("Area of Circle is: " +Area);
			
		}
		//s1.close();
		System.out.println("You have entered 10 values of radius of the circle");
	}
}
