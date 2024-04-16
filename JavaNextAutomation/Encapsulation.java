package JavaNextAutomation;

public class Encapsulation 
{
	private String name="Hello World";
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	
	private double numb=12.3456;
	public double getNumb()
	{
		return numb;
	}
	public void setNumb()
	{
		this.numb=numb;
	}
	
	
	private int age=18;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public static void main(String[] args)
	{
		Encapsulation e1=new Encapsulation();
		e1.setName("Vaishnavi Thakkannavar");
		System.out.println(e1.getName());
		
		e1.setNumb();
		System.out.println(e1.getNumb());
		
		e1.setAge(30);
		System.out.println(e1.getAge());
	}

}
