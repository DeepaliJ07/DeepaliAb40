//For if else if block ONLY the FIRST TRUE CONDITION will execute and rest will be ignored and not executed
package BasicAutomationTestClass;

public class IfelseIfExample 
{
public static void main(String[] args) 
{
	int a=900;
	int b=200;
	int c=300;
	if(a<b)
	{
		System.out.println("One");
	}
	else if(b<c)    //even if b<c, but first condition is true and so it will not execute and of the elseif or else block
	{
		System.out.println("Two");
	}
	else
	{
		System.out.println("Three");
	}
	System.out.println("coming out of ielseif block and returning to main method");
}
}

