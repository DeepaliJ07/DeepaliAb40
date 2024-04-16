package StringFunction;


//trim function just remove spaces at FRONT and END of the String and does not consider the in beween spaces
public class trimStringFunction
{
public static void main(String[] args)
{
	String input1="    I am new student      ";
			String input2="     Hello     my name    is Vaishu      ";
			
			String input111=input1.trim();
			System.out.println(input1);
			System.out.println(input111);
			
			String input222=input2.trim();
			System.out.println(input2);
			System.out.println(input222);
			
}
}
