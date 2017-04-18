package demo;

/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.*/

import java.util.Scanner;

public class Ex_2_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter subtotal.
		System.out.print("Enter the subtotal:");
		
		// Establishes value of subtotal based on user input.
		double subtotal = input.nextDouble();
		
		double gratuity = subtotal * 0.15;
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is: $" + gratuity + " The total is: $" + total);

	}

}
