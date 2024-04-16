package Assignments;
public class TablePrint2_22_1_a2
{
	public static void main(String[] args)
	{
		int[] Sr_no =new int[4];
		Sr_no[0]=1;
		Sr_no[1]=2;
		Sr_no[2]=3;
		Sr_no[3]=4;
		
		String name[]= {"Kushal  ", "Kushal P", "Vishal Prasad", "Monica Rawat", "Kushagra Verma"};
		
		char[]  Gender=new char[5];
		Gender[0]='M';
		Gender[1]='M';
		Gender[2]='M';
		Gender[3]='F';
		Gender[4]='M';
		
		long mobileNo[]= {986574, 857412, 857421, 968521, 967452};
		
		System.out.print("Student name \t");
		for(int i=0;i<name.length;i++)
		{
		System.out.print(name[i]+ "\t"  );
		}
		System.out.println("");
		
		System.out.print("Gender \t");
		for(int i=0;i<Gender.length;i++)
		{
		System.out.print("\t      " +Gender[i]+ "\t"  );
		}
		System.out.println("");
		
		System.out.print("Mobile Number \t");
		for(int i=0;i<mobileNo.length;i++)
		{
		System.out.print(mobileNo[i]+ "   \t    "  );
		}
		System.out.println("");	
	}

}
