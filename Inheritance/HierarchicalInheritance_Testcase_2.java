package Inheritance;

public class HierarchicalInheritance_Testcase_2 extends HierarchicalInheritanceLogin
{
static void search()
{
	System.out.println("search-testcase2-method");
}
	public static void main(String[] args) 
	{
		//add(); 
		//cannot add this as we do not have any relation between testcase1 and testcase_2
		search();
		username();
		password();
		click();
	}
	
}
