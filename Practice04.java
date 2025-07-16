/*

✅ 4. Basic ATM Simulation
Description: Simulate ATM operations like check balance, deposit, and withdraw.

High-Level Steps:
Show a menu with options.
Use switch-case or if-else for user choice.
Handle deposit, withdrawal (check if sufficient balance).
Loop back to menu until user exits.

Future Enhancement:
Ask the user to enter a PIN before showing the ATM menu.
*/

package com.ferry.practice.fundamentals;

import java.util.Scanner;

public class Practice04 {

	public static int balance = 100;

	public static void main(String[] args) {

		int choice;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("--- ATM Menu ---");
			System.out.println("1 - Check Balance");
			System.out.println("2 - Deposit");
			System.out.println("3 - Withdraw");
			System.out.println("4 - Exit");

			System.out.print("Enter your choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Total Balance :" + balance);
				break;

			case 2:
				System.out.print("Enter your Amount to deposit: ");
				int deposit = scanner.nextInt();

				if (deposit > 0) {
					balance = balance + deposit;
					System.out.println("Total balance after deposit :" + balance);
				}

				else {
					System.out.println("Invalid deposit amount.");
				}
				break;

			case 3:
				System.out.print("Enter your Amount to withdraw: ");
				int withdraw = scanner.nextInt();

				if (withdraw > balance) {
					System.out.println("Insufficient Balance");
				}

				else if (withdraw <= 0) {
					System.out.println("Invalid withdrawal amount");
				}

				else {
					balance = balance - withdraw;
					System.out.println("Total Balance after withdraw :" + balance);
				}

				break;

			case 4:
				System.out.println("Exiting... Thank you");
				break;

			default:
				System.out.println("Invalid Choice, Choose the correct option");
				break;
			}
		} while (choice != 4);

		scanner.close();

	}
}
