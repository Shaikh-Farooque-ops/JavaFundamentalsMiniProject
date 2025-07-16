/*

✅ 3. Number Guessing Game
Description: The program generates a random number. User guesses until it's correct.

High-Level Steps:
Generate a random number within a range.
Prompt user to guess the number.
Use loop and conditions to check guess.
Show total attempts and win message.

Future Enhancement: 
Add “Play Again” Option : “Do you want to play again? (yes/no)”
*/

package com.ferry.practice.fundamentals;

import java.util.Scanner;

public class Practice03 {

	public static int min = 1;
	public static int max = 100;

	public static void main(String[] args) {

		// Type cast =     0.22 something *       100        + 1
		int number = (int) (Math.random() * (max - min + 1)) + min;

		int totalAttempt = 0;

		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("🎯 Welcome to the Number Guessing Game!");
	     System.out.println("Guess a number between 1 and 100:");

		for (int i = 1; i <= 10; i++) {

			totalAttempt = totalAttempt + 1;

			System.out.print("Enter your guess :");
			int usernNo = scanner.nextInt();

			if (usernNo == number) {
				System.out.println("✅ Congratulations You guesed the number in " + totalAttempt + " attempt");
				break;
			}

			else if (usernNo > number) {
				System.out.println("Too high! Try a smaller number");
			}

			else {
				System.out.println("Too low! Try a bigger number");
			}
		}

	}
}
