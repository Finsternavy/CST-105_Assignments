package demo;

import java.util.Scanner;

public class Ex_3_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2):");
		int guess = input.nextInt();
		int computer = (int)(Math.random() * 3);
		
		String stringComputer = "";
		
		switch (computer) {
		
		case 0: stringComputer = "scissor";
			break;
		case 1: stringComputer = "rock";
			break;
		case 2: stringComputer = "paper";
			break;
		
		}
		
		String stringGuess = "";
		
		switch (guess) {
		
		case 0: stringGuess = "scissor";
			break;
		case 1: stringGuess = "rock";
			break;
		case 2: stringGuess = "paper";
			break;
		
		default:
		System.out.print("Invalid input.");
		System.exit(0);
		
		}
		
		System.out.print("The computer is " + stringComputer + ". You are " + stringGuess);
		
		if (computer == guess) {
			
			System.out.print(" too. It is a draw");
			
		}		
		
		else if (computer - guess == 1 || computer - guess == -2) {
		System.out.print(". Computer won.");
		
		}
		
		else if (computer - guess == -1 || computer - guess == 2) {
		System.out.print(". You won.");
		
		}
			
	}
		

}

