package Arrays;

public class AverageOfArray 
{
	public static void main(String[] args)
	{
		int sum=0;
		int[] num=new int[5];
		num[0]=9;
		num[1]=1;
		num[2]=5;
		num[3]=10;
		num[4]=5;
		
		for(int i=0; i<num.length;i++)
		{
			sum=sum+num[i];
			
		}
		System.out.println(sum);
		double average =sum/num.length;
		System.out.println("Average of given array is : " +average);
		

	}
}
