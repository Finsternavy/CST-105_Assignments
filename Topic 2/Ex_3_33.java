package demo;

import java.util.Scanner;

public class Ex_3_33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price of package 1: ");
		
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print("Enter weight and price of package 2: ");
		
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double package1 = price1 / weight1;
		double package2 = price2 / weight2;
		
		if (package1 < package2) {
			System.out.print("Package 1 has a better price.");
			} else if (package1 == package2) {
				System.out.print("Two packages have the same price.");
			} else
				System.out.print("Package 2 has a better price.");

	}

}
