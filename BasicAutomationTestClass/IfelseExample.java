//Here we have 2 block if and else, If condition is true then it will execute IF block and will not excute else block
//but if condition is false then only else Block will be executed
package BasicAutomationTestClass;

public class IfelseExample 
{
public static void main(String[] args)
{
	int age=5;     //change these values and verify output
	if(age>18)
	{
		System.out.println("We can Vote");
	}
	else
	{
		System.out.println("We CANNOT vote");
	}
	System.out.println("Votings open til 6pm");
}
}
