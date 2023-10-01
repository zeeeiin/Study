package week05_my_solve;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
	public static void main(String[] args) {
		Random random = new Random();
		int targetNumber = random.nextInt(10) + 1; // Generate a random number between 1 and 10
		int attempts = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Random Number Game!");

		while (true) {
			try {
				System.out.print("Enter a number between 1 and 10: ");
				int guess = Integer.parseInt(scanner.nextLine());

				if (guess < 1 || guess > 10) {
					throw new IllegalArgumentException("Number out of range!");
				}

				attempts++;

				if (guess == targetNumber) {
					System.out.println("Congratulations! You guessed the correct number!");
					System.out.println("Number of attempts: " + attempts);
					break;
				} else {
					System.out.println("Incorrect guess. Try again!");
					System.out.println("Number of attempts: " + attempts);
				}
			} catch (NumberFormatException e) { 
				System.out.println("Invalid input! Please enter a valid number.");
			} catch (IllegalArgumentException e) { 
				System.out.println(e.getMessage());
			}
		}

		scanner.close();
	}
}

