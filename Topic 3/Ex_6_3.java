package demo;

import java.util.Scanner;

public class Ex_6_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter in integer: ");
		int number = input.nextInt();
		int i = 0;
		
		if (isPalindrome(number)) {
		System.out.print(number + " Is a palindrome");
		} else {
		System.out.print(number + " Is not a palindrome");
		}
		
	}
	
		// Return the reversal of an integer, i.e., reverse (456) returns 654
		public static int reverse(int number){
			int reverse = 0;
			int digit;
			
			do {
				digit = number % 10;
				reverse = reverse * 10 + digit;
				number /= 10;
			} while (number != 0);
			return reverse;
	}
		
		// Return true if number is a palindrome 
		public static boolean isPalindrome(int number){
			return (number == reverse(number));
		}

	
		
}
