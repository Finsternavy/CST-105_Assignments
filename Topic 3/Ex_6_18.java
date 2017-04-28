package demo;

import java.util.Scanner;

public class Ex_6_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String s = input.nextLine();
		
		if (checkPassword(s)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}

	}

	public static boolean checkPassword(String password) {
		
		boolean checkPassword = true;
		
		if (password.length() < 8) {
			checkPassword = false;
		} else {
			int numberOfDigits = 0;
			for (int i = 0; i < password.length(); i++) {
				if (isDigit(password.charAt(i)) || isLetter(password.charAt(i))) {
					if (isDigit(password.charAt(i))) {
						numberOfDigits++;
					}
				} else {
					checkPassword = false;
					break;
				}
			}
	
			if (numberOfDigits < 2) {
				checkPassword = false;
			}
			
		}
	
		return checkPassword;
	}
	
	public static boolean isLetter(char ch) {
		return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
	}
	
	public static boolean isDigit(char ch) {
		return (ch <= '9' && ch >= '0');
	}
	
}
