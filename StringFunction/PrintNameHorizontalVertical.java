package StringFunction;

public class PrintNameHorizontalVertical 
{
	public static void main(String[] args)
	{
		String name="Vaishnavi";
		String rev="";
		   System.out.println("Printing vertically :");
		   for(int i=0;i<name.length();i++)
		   {
			   System.out.println(name.charAt(i)); 
		   }
		   System.out.print("Printing Horizontal :");
		   for(int i=0;i<name.length();i++)
		   {
			   System.out.print(name.charAt(i)); 
		   }
		   System.out.println("");
		   System.out.println("Printing reverse");
		   for(int j=name.length()-1;j>=0;j--)
		   {
			  rev =rev +name.charAt(j);
		   }
		   System.out.println(rev);
	}
}
