package JavaNextAutomation;

public class ThrowsExample
{
	public static void main(String[] args) throws InterruptedException , NullPointerException
	{
		Thread.sleep(2000);
		throw new NullPointerException("Sorry you have an empty file");
		
		
	}

}
