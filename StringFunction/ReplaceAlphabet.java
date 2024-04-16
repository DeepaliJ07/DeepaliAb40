package StringFunction;

public class ReplaceAlphabet 
{
public static void main(String[] args)
{
	String name="Hello I am Manish";
	String output=name.replace('a', 'Z');
	System.out.println(output);
	
	
	System.out.println(name.replace('h','T')); 
	//only small 'h' is replaced and not Capital 'H'
}
}
