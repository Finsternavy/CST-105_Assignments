package demo;

/*(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment
using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.*/

import java.util.Scanner;

public class Ex_2_20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the current balance:");

		float balance = input.nextFloat();
		
		System.out.print("Enter the annual percentage interest rate:");
		
		float annualPercentageInterestRate = input.nextFloat();
		
		float interest = balance * (annualPercentageInterestRate / 1200);
		
		System.out.println("The interest for the next month is: " + interest);
		
	}

}
