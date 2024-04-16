//Program to add 4 methods add/sub/mul/div using only 2 variables.
package BasicAutomationTestClass;

public class globalvariable3
{
static int a=20;
static int b=10;

static void add()
{ 
	System.out.println(a+b);
}
static void sub()
{
	System.out.println(a-b);
}
static void mul()
{
	System.out.println(a*b);
}
 void div()
{
	System.out.println(a/b);
}
public static void main(String[] args)
{
	add();
	sub();
	mul();
	globalvariable3 g1=new globalvariable3();
	g1.div();
}
}
