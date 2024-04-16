package BasicAutomationTestClass;

public class ContinueKeyword 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
			
			if(i==4)
			{
				continue;  ///Skip in the program
			}
			System.out.println("Number is " +i);
		}
		
	}

}
