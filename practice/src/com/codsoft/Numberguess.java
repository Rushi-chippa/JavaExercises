package com.codsoft;

import java.util.Random;
import java.util.Scanner;

public class Numberguess {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Enter your guessing number ");

		int score = 0;

		boolean playagain = true;

		while (playagain) {

			int targetNumber = random.nextInt(100) + 1;
			int attempts = 0;
			int maxAttempts = 5;

			System.out.println(
					"Do you selected the number between 1 to 100 , you have to enter that number to guess which number is that one ");

			while (attempts < maxAttempts) {
				System.out.println("Enter your guess number ");
				int guessnumber = sc.nextInt();
				sc.nextLine();

				attempts++;

				if (guessnumber == targetNumber) {
					System.out.println("Congrats you guessed right " + targetNumber + " in " + attempts
							+ "your entered number is " + guessnumber);
					score++;
					break;
				} else if (guessnumber < targetNumber) {
					System.out.println(" your entered number is too low than expected number ");

				}

				else {
					System.out.println("you entered number is too high than expected number ");
				}

			}

			if (attempts >= maxAttempts) {
				System.out.println("Sorry you excedded the limit , the correct number was " + targetNumber);
			}
			System.out.print("Do you want to play again? (yes/no): ");
			String playAgainInput = sc.nextLine();
			playagain = playAgainInput.equalsIgnoreCase("yes");
		}

		System.out.println("Game over! Your score: " + score);

	}
}
