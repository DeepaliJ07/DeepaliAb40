package BasicProgram;

import java.util.Date;

public class TodayDate
{
	public static void main(String[] args)
	{
		Date d1=new Date();
		long currentTime =d1.getTime();
		System.out.println(currentTime);  //machine understandable time //epoch converter
		
		Date d2=new Date(d1.getTime());
		System.out.println("Current Time is : " +d2);  //Current Date and time  
		
		Date d3=new Date(d1.getTime()+(1000*60*60*24));
		System.out.println("Tomorrow Date will be : " +d3); 
		
		Date d4=new Date(d1.getTime()+(1000*60*60*24*5));
		System.out.println("Date & Time after 5 days will be : " +d4);
		
		Date d5=new Date(d1.getTime()-(1000*60*60*24*7));
		System.out.println("Date & Time before 7 days was : " +d5);
		
		//Print only month for current time
		String DateTime=d2.toString();
		System.out.println("Current Date and Time is : " +DateTime);
		String month =DateTime.substring(4, 7);
		System.out.println(month);
		
		//Print Date:
		String Date=DateTime.substring(8, 10);
		System.out.println(Date);
		
		//Print year:
		String year= DateTime.substring(DateTime.length()-4);
		System.out.println(year);
		
		//Print Date in format: DD/MM/YYYY
		System.out.println(Date.concat("/").concat(month).concat("/").concat(year));

	}
}
