package StringFunction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringFunct2
{
public static void main(String[] args)
{
	String name="Hey my 9Name is 78ManishT";
	String fame="";
	String hello="Vaishu";
	System.out.println(name.replaceAll("[a-z]", ""));
	
	System.out.println(name.replaceAll("[A-Z]", "hello"));
	System.out.println(name.replaceAll("[0-9]", "d"));
	
	System.out.println(name.isEmpty());
	System.out.println(fame.isEmpty());
	
	//System.out.println(fame.isBlank());
	
	System.out.println(name.lastIndexOf('a'));
	
	System.out.println(name.equalsIgnoreCase(name));
	System.out.println(name.equalsIgnoreCase(fame));
	
	System.out.println(hello.repeat(5));

	System.out.println(hello.toCharArray()); //convert string to char array
	System.out.println(Arrays.toString(hello.toCharArray()));
}
}
