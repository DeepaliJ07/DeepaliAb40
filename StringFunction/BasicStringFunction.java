package StringFunction;

public class BasicStringFunction
{
	public static void main(String[] args)
	{
		String name="Vaishnavi";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(2));
		System.out.println(name.equals("Vaishnavi"));
		System.out.println(name.contains("Vaishu"));
		
		String input="I am Student, Megha";
		System.out.println(input.substring(4));
		System.out.println(input.substring(5, 9));
		System.out.println(input.concat(" Birajdar"));
		
		
	}
}
