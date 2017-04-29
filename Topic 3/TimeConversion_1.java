package demo;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TimeConversion_1 {

	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a time in 24-hour format: ");
		

	    String time = input.nextLine();
		String time24 = time;

	    Integer timeint = Integer.parseInt(time24);

	    Calendar calendar = Calendar.getInstance();

	    calendar.set(Calendar.HOUR_OF_DAY, timeint);

	    calendar.set(Calendar.MINUTE, 0);

	    SimpleDateFormat sdf = new SimpleDateFormat("ha");

	    String time12 = sdf.format(calendar.getTime());

	    System.out.println(time12);

	}

}
