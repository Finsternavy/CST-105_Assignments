package demo;

import java.util.Scanner;

public class Ex_3_26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer:");
		int number = input.nextInt();
		
		if (number % 5 == 0 && number % 6 == 0)
			System.out.print("Is " + number + " divisible by 5 and 6? true");
		else 
			System.out.print("Is " + number + " divisible by 5 and 6? false");
		
		if (number % 5 == 0 || number % 6 == 0)
			System.out.print("\nIs " + number + " divisible by 5 or 6? true");
		else
			System.out.print("\nIs " + number + " divisible by 5 or 6? false");
		
		if (number % 5 == 0 ^ number % 6 == 0)
			System.out.print("\nIs " + number + " divisible by 5 or 6, but not both? true");
		else
			System.out.print("\nIs " + number + " divisible by 5 or 6, but not both? false");

	}

}
