package demo;

import java.util.Scanner;

public class Ex_4_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Prompts user to enter a year.
		System.out.print("Enter a year:");
		//Assigns user entry to year.
		int year = input.nextInt();
		
		//Prompts user to enter a month using first 3 letters.
		System.out.print("Enter a month (First three letters):");
		//Assigns user entry to month.
		String month = input.next();
		
		int days = 0;
		
		//Allows month to be tested for equality against the list of months.
		switch (month) {
		case "Feb":
			//Accounts for leap year
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
				break;
			}
			
			//typical days in Feb
			days = 28;
			break;
			
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			//Typical days in these months
			days = 30;
			break;
			
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			//Typical days in these months
			days = 31;
			break;
			
		//If user enters improper format system displays "Invalid month."
		default:
			System.out.println("Invalid month.");
			System.exit(0);
			
		}
		
		System.out.println(month + " " + year + " has " + days + " days");

	}

}
