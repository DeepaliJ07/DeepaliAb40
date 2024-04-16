package Assignments;

public class TablePrint_22_1_a1
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
				
		System.out.println("Sr no \tName    \tGender\tMobileNumber");
		for(int i=0;i<Sr_no.length;i++)
		{
		System.out.println(Sr_no[i] +"\t" +name[i]+ "\t" +Gender[i]+ "\t" +mobileNo[i] );
		}
	}

}
