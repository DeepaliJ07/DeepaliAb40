//Create an array of length 4 and check if given number 6 is present in the Array or not

package Arrays;

public class VerifyNumberPresentInArray 
{
	public static void main(String[] args)
	{
		int[] numb=new int[4];
		numb[0]=8;
		numb[1]=10;
		numb[2]=6;
		numb[3]=69;
		for(int i=0;i<numb.length;i++)
		{
			if(numb[i]==6)
			{
				System.out.println("Number 6 is present at index : " +i);
			}
			else
			{
				System.out.println("Number 6 is NOT present at index : " +i);
			}
		}
	}

}
