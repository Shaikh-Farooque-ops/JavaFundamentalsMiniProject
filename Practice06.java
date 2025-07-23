/*
✅ 6. Basic Calculator (Menu Driven) 
Description: Perform arithmetic operations using menu choices.

High-Level Steps:
Show options: add, subtract, multiply, divide.
Use switch-case or if-else for operations.
Accept two numbers from user.
Display result and repeat until exit.

Future Enhancement:
Division by Zero Risk:
You should check if secondNo != 0 before performing division to avoid a runtime exception.
*/

package com.ferry.practice.fundamentals;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		int result = 0;
		int choice;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			if (choice >= 1 && choice <= 4) {

				System.out.print("Enter First No: ");
				int firstNo = scanner.nextInt();

				System.out.print("Enter Second No: ");
				int secondNo = scanner.nextInt();

				switch (choice) {
				case 1:
					result = firstNo + secondNo;
					System.out.println("Addition of Two No is :" + result);
					break;

				case 2:
					result = firstNo - secondNo;
					System.out.println("Subtraction of Two No is :" + result);
					break;

				case 3:
					result = firstNo * secondNo;
					System.out.println("Multiplication of Two No is :" + result);
					break;

				case 4:
					result = firstNo / secondNo;
					System.out.println("Division of Two No is :" + result);
					break;

				default:
					System.out.println("Choose a correct option");
					break;

				}
			}

			else if (choice == 5) {
				System.out.println("Thank you for choosing our calculator 🧮");
			}

			else {
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 5);

		scanner.close();

	}

}
