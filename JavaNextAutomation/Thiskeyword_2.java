package JavaNextAutomation;

public class Thiskeyword_2 
{

	String name;
	int age;
	double salary;
	boolean b;

	void details(String name,int age,double salary,boolean b)
	{
		System.out.println("My name is :" +name +" My age is :" +age+ " My salary is " +salary);
		System.out.println("Above statement is :" +b);
		
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.b=b;
	}
	public static void main(String[] args)
	{
		Thiskeyword_2 d1=new Thiskeyword_2();	
		d1.details("Vaishu", 1, 50000,true);
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.salary);
		System.out.println(d1.b);

	}


}
