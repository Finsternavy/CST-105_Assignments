package demo;

import java.util.Scanner;

public class Ex_4_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer between 0 and 15: ");
		int i = input.nextInt();
		
		if (i < 0 || i > 15) {
			System.out.println(i + " is an invalid input");
			System.exit(0);
		}
		
		System.out.println("The hex value of integer " + i + " is " 
				+ Integer.toHexString(i).toUpperCase());

	}

}
