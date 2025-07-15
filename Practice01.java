/*
 
✅ 1. Student Grade Calculator

Description: Input marks of 5 subjects, calculate total, percentage, and display grade.

High-Level Steps:
Take student’s name and subject marks as input.
Calculate total and percentage.
Use if-else to assign grade (A/B/C/Fail).
Display all details.


Option Enhancement:
use for loop for getting marks and subject Name 
Validation
Formatting
Take Multiple Students Data

*/

package com.ferry.practice.fundamentals;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();
		System.out.println("Student Name is :" + name);

		System.out.print("Enter C marks: ");
		int sub1 = scanner.nextInt();
		System.out.println("Marks of Subject 1 is :" + sub1);

		System.out.print("Enter C++ marks: ");
		int sub2 = scanner.nextInt();
		System.out.println("Marks of Subject 2 is :" + sub2);

		System.out.print("Enter Java marks: ");
		int sub3 = scanner.nextInt();
		System.out.println("Marks of Subject 3 is :" + sub3);

		System.out.print("Enter Python marks: ");
		int sub4 = scanner.nextInt();
		System.out.println("Marks of Subject 4 is :" + sub4);

		System.out.print("Enter C# marks: ");
		int sub5 = scanner.nextInt();
		System.out.println("Marks of Subject 5 is :" + sub5);

		System.out.println();

		float total = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Total Marks :" + total);

		System.out.println();

		System.out.println("Calculating Percentage...");
		float percentage = (total * 100.0F) / 500;
		System.out.println("Percentage is :" + percentage + "%");

		System.out.println("Calculating Grade...");
		if (percentage >= 90 && percentage <= 100) {
			System.out.println("Grade is :A");
		}

		else if (percentage >= 80 && percentage <= 89) {
			System.out.println("Grade is :B");
		}

		else if (percentage >= 70 && percentage <= 79) {
			System.out.println("Grade is :C");
		}

		else {
			System.out.println("Grade is :Fail");
		}

		scanner.close();
	}

}
