package JavaNextAutomation;

public class PrimitiveTypeCasting 
{
	public static void main(String[] args) 
	{
		System.out.println("*****Widening******");
		//implicit:
		double weight=61;
		System.out.println(weight);
		
		//explicit:
		double weight11=(double) 83;
		System.out.println(weight11);
		
		System.out.println("*****Narrowing******");
		//Narrowing can be done ONLY EXPLICIT
		
		int data=(int)98.33;
		System.out.println(data);
		
		double pi=3.14;
		int piNew=(int) pi;
		System.out.println(piNew);
		
		
	}

}
