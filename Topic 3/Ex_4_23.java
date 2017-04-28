package demo;

import java.util.Scanner;

public class Ex_4_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double ftax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stax = input.nextDouble();
		
		System.out.println("\nEmployee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + rate * hours);
		System.out.println("Deductions:");
		System.out.printf("  Federal Withholding (%.1f%%):  $%.2f\n", ftax * 100, ftax * rate * hours);
		System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stax * 100, stax * rate * hours);
		System.out.printf("  Total Deduction: $%.2f\n", (stax + ftax) * rate * hours);
		System.out.printf("Net Pay: $%.2f", (1 - stax - ftax) * rate * hours);
		
	}

}
