package com.app;

import java.util.Scanner;

import com.parents.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//totally for the console
		boolean userInputCorrect = false;
		
		do {	
		System.out.println("Welcome to Silly D'n'D\n"
				+ "Would you like to play as\n"
				+ "1. Human Wizard\n"
				+ "2. Elf Royal\n"
				+ "3. Twi'lek Jedi\n"
				+ "4. Smurf Warrior\n"
				+ "5. Turtle Ninja");
		
		String userInput = sc.nextLine();
		
	
			switch (userInput) {
			case "1":
				// Call to HumanWizard methods here
				break;
			case "2":
				// Call to ElfRoyal methods here
				break;
			case "3":
				// Call to Twi'lekJedi methods here
				break;
			case "4":
				// Call to SmurfWarrior methods here
				break;
			case "5":
				// Call to TurtleNinja methods here
				break;
			default:
				userInputCorrect = true;
				System.out.println("You are invalid!\n"
						+"1, 2, 3, 4, 5 are proper choices.\n"
						+"");
				break;
			}
		} while (userInputCorrect);

	} //main

}//App
