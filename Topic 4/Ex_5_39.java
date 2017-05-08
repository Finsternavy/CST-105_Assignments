package demo;

import java.util.Scanner;

public class Ex_5_39 {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter commission amount:");
		  double commissionWanted = input.nextDouble();
		  double sale;
		 
		  if (commissionWanted <= 400) {
		   sale = commissionWanted / 0.08;
		 
		  } else if (commissionWanted <= 900) {
		   sale = (commissionWanted - 400) / 0.1 + 5000;
		  } else {
		   sale = (commissionWanted - 900) / 0.12 + 10000;
		  }
		 
		  
		  
		  System.out.printf("The sale you need to generate is $%.2f", sale);
		 
		 }
		 
		}
