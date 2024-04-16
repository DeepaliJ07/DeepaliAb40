package BasicAutomationTestClass;

import java.util.Scanner;

public class Switch_class
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the case number to be executed:");
		int a=s1.nextInt();

		switch(a)
		{
		case 1:
			System.out.println("Logic 1"); 
			break;
		case 2:
			System.out.println("Logic 2"); //if break not added then next all case will execute
			break;
		case 3:
			System.out.println("Logic 3");
			
		case 4:
			System.out.println("Logic 4");
			break;
		default:
			System.out.println("Sorry, you have made wrong selection");
		}
	}
}
