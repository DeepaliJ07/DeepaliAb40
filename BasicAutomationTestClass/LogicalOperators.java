/*Logical operators:
 * AND									
|Condition 1|Condition 2|output|
|True       |True       |True  |
|False      |False      |False|
|False      |True       |False|
|True       |False      |False|

* OR
|Condition 1|Condition 2|output|
|True       |True       |True  |
|False      |False      |False|
|False      |True       |True|
|True       |False      |True|

*/
package BasicAutomationTestClass;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		int age=20;
		int salary=72000;
		if (age>18 && salary==50000)
		{
			System.out.println("Ram");
		}
		else if(age>18 && salary==72000)
		{
			System.out.println("Sita");
		}
		else
		{
			System.out.println("Laxman");
		}




	}

}
