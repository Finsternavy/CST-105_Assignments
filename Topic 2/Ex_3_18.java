package demo;

import java.util.Scanner;

public class Ex_3_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package:");
		double weight = input.nextDouble();
		
		double shippingCost = 0;
		
		if (0 < weight && weight <= 1) {
			shippingCost = 3.50;
		}

			else if (1 < weight && weight <= 3) {
			shippingCost = 5.50;
		}
		
			else if (3 < weight && weight <= 10) {
			shippingCost = 8.50;
		}
		
			else if (10 < weight && weight <= 20) {
			shippingCost = 10.50;
		}
		
		if (shippingCost == 0) {
			System.out.print("The package cannot be shipped.");
			System.exit(0);
		}
		
		System.out.println("The cost of shipping is " + shippingCost);
		
	}

}
