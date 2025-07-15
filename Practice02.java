/*

✅ 2. Simple Interest & EMI Calculator
Description: Calculate Simple Interest and EMI based on user input.

High-Level Steps:
Input principal, rate, and time.
Calculate Simple Interest using formula.
Ask if user wants to calculate EMI as well.
Display final interest or monthly EMI.


Note: Don't take instance variable it’s not safe or clean 
Future Enhancement:
Validation
User Input Value

*/

// 1. Calculate SI  2. Amount of EMI + SI  3. EMI+SI/Months

package com.ferry.practice.fundamentals;

public class Practice02 {

	public static void main(String[] args) {

		Practice02 p2 = new Practice02();
		double SI = p2.calculateSimpleInterest(10000, 10, 1);
		System.out.println("Simple Interest is : ₹" + SI);
		p2.calculateEMI(10000, 12, SI);
	}

	public double calculateSimpleInterest(double principle, double rate, double time) {
		double interest = (principle * rate * time) / 100;
		return interest;
	}

	public void calculateEMI(double principle, double noOfMonths, double SI) {

		double totalAmount = principle + SI;
		System.out.println("Total Amount to Pay Back : ₹" + totalAmount);

		double monthlyPayment = totalAmount / noOfMonths;
		System.out.println("Monthly EMI : ₹" + monthlyPayment);
	}
}
