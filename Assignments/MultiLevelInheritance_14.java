//To create 5 classes for Multilevel Inheritance
package Assignments;

class Grandparent
{
	static void Class5()
	{
		System.out.println("Grandparent--class 5");
	}
}
	class Parent extends Grandparent
	{
		static void Class4()
		{
			System.out.println("Parent--class 4");
		}
	}
	class State extends Parent
	{
		static void Class3()
		{
			System.out.println("State--class 3");
		}
	}
	class City extends State
	{
		static void Class2()
		{
			System.out.println("City--class 2");
		}
	}
	class Town extends City
	{
		static void Class1()
		{
			System.out.println("Town--class 1");
		}
	}
	public class MultiLevelInheritance_14 extends Town

	{
		public static void main(String[] args) 
		{
			Class1();
			Class2();
			Class3();
			Class4();
			Class5();
		}
	}
