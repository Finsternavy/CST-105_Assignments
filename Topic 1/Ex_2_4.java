package demo;

import java.util.Scanner;

public class Ex_2_4 {

	public static void main(String[] args) {
				
			Scanner input = new Scanner(System.in);
			// Prompts user to enter a value in pounds to be converted.	
			System.out.print("Enter a value for pounds:");
			
			// Establish pounds value based on users input.
			double pounds = input.nextDouble();

			// Converts pounds to kilograms.
			double kilograms = pounds * 0.454;
			
			// Displays the results of the calculation on the screen.
			System.out.println(pounds + " pounds is equal to " + kilograms);
			
	}

}
