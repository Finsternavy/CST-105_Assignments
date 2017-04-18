package demo;

import java.util.Scanner;  // Sanner is in the java,util package

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		
		// Creates a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a value for radius
		System.out.print("Enter a number for radius:");
		
		// defines radius as number entered by user
		double radius = input.nextDouble();
		
		// defines area as formula for area based on radius value entered by user
		double area = radius * radius * 3.14159;
		
		// prints the area of a circle with the value of radius entered by user
		System.out.println("The area of a circle with a radius " + radius  + " is " + area);

	}

}
