//Find out future time in 10days
package Assignments;

import java.util.Date;

public class Futuretime_18 
{
public static void main(String[] args)
{
	Date d1=new Date();
	
	Date d2=new Date(d1.getTime());
	System.out.println("Future time and date for next 10 days ");
	
	for(int i=1;i<11;i++)
	{
	Date d3=new Date(d1.getTime()+(1000*60*60*24*i));
	System.out.println(d3);
	}
}
}
