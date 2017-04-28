package demo;

import java.util.Scanner;

public class TimeConversion_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an hour in the 24 hour format: ");
		int hour = input.nextInt();
		
		if (hour < 0 || hour > 24) {
			System.out.println("Invalid entry");
			System.exit(0);
		} else if (hour == 0) {
			System.out.print("12am.");
		} else if (hour == 12) {
			System.out.print("12pm.");
		} else if (hour > 12) {
			System.out.print(hour % 12 + "pm.");
		} else {
			System.out.print(hour % 12 + "am.");
		}
		

	}

}
