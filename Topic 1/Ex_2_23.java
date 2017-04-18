package demo;

/*(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.*/

import java.util.Scanner;

public class Ex_2_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Prompts user to enter driving distance.
		System.out.print("Enter the driving distance: ");
		
		// Establish driving distance from user input.
		double drivingDistance = input.nextDouble();
		
		// Prompts user to enter miles per gallon.
		System.out.print("Enter miles per gallon: ");
		
		// Establish miles per gallon from user input.
		double milesPerGallon = input.nextDouble();
		
		// Prompts user to enter price per gallon.
		System.out.print("Enter price per gallon: ");
		
		// Establish price per gallon from user input.
		double pricePerGallon = input.nextDouble();
		
		// Calculates the cost of the trip.
		double costOfDriving = drivingDistance / milesPerGallon * pricePerGallon;
		
		// Reduces the result to two decimal points. 
		double roundOff = Math.floor(costOfDriving *100) / 100;
		
		// Displays the cost of driving in dollars and cents.
		System.out.println("The cost of driving is $" + roundOff);
		
	}

}
