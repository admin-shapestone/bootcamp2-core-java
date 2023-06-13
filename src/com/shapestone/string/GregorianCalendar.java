package com.shapestone.string;
import java.util.*;
public class GregorianCalendar
{

	public static void main(String[] args) {
   String months[] = {"jan","feb","mar","april","may","june","july","august","sept","octo","nove","dec"};
   int year;
  // CalenderofYear c1=new CalenderofYear();
   System.out.println( "date:");
   
   
   GregorianCalendar gcalendar = new GregorianCalendar();
   
   // Display current time and date information.
   System.out.print("Date: ");
   System.out.print(months[gcalendar.get(Calendar.MONTH)]);
   System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
   System.out.println(year = gcalendar.get(Calendar.YEAR));
   System.out.print("Time: ");
   System.out.print(gcalendar.get(Calendar.HOUR) + ":");
   System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
   System.out.println(gcalendar.get(Calendar.SECOND));

   // Test if the current year is a leap year
   if(gcalendar.isLeapYear(year)) {
      System.out.println("The current year is a leap year");
   }else {
      System.out.println("The current year is not a leap year");
   }
}
}
   
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

	