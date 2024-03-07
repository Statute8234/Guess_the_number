package com.test.java;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// points and input number
		int points = 100;
		int input = 0;
		int next_number = 100;
		// make a random number
		Random rand = new Random();
		int rand_int1 = rand.nextInt(points);
		// input system
		Scanner guess = new Scanner(System.in);
		// loop
		while (true) {
			String str1 = String.format("what number am I thinking of? Its between (0 - %d) > ",next_number);
			System.out.print(str1);
			if (guess.hasNextInt()) {
				input = guess.nextInt();
				if (input < 0) {
					System.out.print("sorry " + input + " is not an option, try a positive number)");
				} else {
					if (input != rand_int1) {
						points -= 1;
						if (input > rand_int1) {
							System.out.println("Try guessing lower");
						} else {
							System.out.println("Try guessing higher");
						}
					} else {
						points += 1;
						System.out.println("That is correct!");
						System.out.println("you have " + points + " points left");
						// make a random number
						next_number = points;
						rand_int1 = rand.nextInt(next_number);
						
					}
				}
			} else {
				System.out.println("sorry, this game only uses numbers.");
				points = 0;
			}
			
			// loose the game
			if (points < 1) {
				System.out.println("sorry, you lost the game");
				break;
			}
		}
	}
}
		
