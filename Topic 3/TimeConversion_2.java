package demo;

import java.util.Scanner;

public class TimeConversion_2 {

	public static void main(String[] args) {

		System.out.print("Enter time in decimal form: ");
		Scanner input = new Scanner(System.in);
		
		
		double timeInDec = input.nextDouble();
		int hours = (int) timeInDec;
		int minutes = (int) (timeInDec * 60) % 60;


		System.out.println(String.format("%s hours %s minutes", hours, minutes));
	}

}
