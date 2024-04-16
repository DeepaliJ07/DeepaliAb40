package JavaNextAutomation;

public class Thiskeyword
{
	String name;
	int age;
	double salary;
	boolean b;

	void details(String name,int age,double salary,boolean b)
	{
		System.out.println("My name is :" +name +" My age is :" +age+ " My salary is " +salary);
		System.out.println("Above statement is :" +b);
		//this takes the default value and value is not initialised
		//lets know how to assign local variable to global variable in next class
	}
	public static void main(String[] args)
	{
		Thiskeyword d1=new Thiskeyword();	
		d1.details("Vaishu", 1, 50000,true);
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.salary);
		System.out.println(d1.b);

	}
}
