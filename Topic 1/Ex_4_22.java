package demo;

import java.util.Scanner;

public class Ex_4_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to input the value of s1.
		System.out.print("Enter string s1:");
		//Assign user input to s1
		String s1 = input.nextLine();
		
		//Prompts user to input value of s2.
		System.out.print("Enter string s2:");
		//Assign user input to s2.
		String s2 = input.nextLine();
		
		//compares s2 to s1 to determine if is is a substring.
		if (s1.contains(s2)) {
			System.out.println(s2 + " is a substring of " + s1);
		} else {
			System.out.println(s2 + " is not a substring of " + s1);
		}

	}

}
