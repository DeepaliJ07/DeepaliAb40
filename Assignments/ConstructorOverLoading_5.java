/*Assignment 5 - Create 5 constructor where 1st constructor should have int ,
2nd const- char; 3rd const- string; 4th const-boolen;and 5th constructor - int a, boolean b,string c
and call it in main method */
//Assignment 5
package Assignments;
public class ConstructorOverLoading_5
{
	ConstructorOverLoading_5(int a)
	{
		System.out.println(a);
	}
	ConstructorOverLoading_5(char b)
	{
		System.out.println(b);
	}
	ConstructorOverLoading_5(String c)
	{
		System.out.println(c);
	}
	ConstructorOverLoading_5(boolean d)
	{
		System.out.println(d);
	}
	ConstructorOverLoading_5(int a, boolean b,String c)
	{
		System.out.print(a);
		System.out.print(" " +b);
		System.out.print(" " +c);
	}
	public static void main(String[] args)
	{
		ConstructorOverLoading_5 c1 =new ConstructorOverLoading_5(5);
		ConstructorOverLoading_5 c2 =new ConstructorOverLoading_5('z');
		ConstructorOverLoading_5 c3 =new ConstructorOverLoading_5("String hello");
		ConstructorOverLoading_5 c4 =new ConstructorOverLoading_5(true);
		ConstructorOverLoading_5 c5 =new ConstructorOverLoading_5(7,true,"Vaishu");
	}
}
 