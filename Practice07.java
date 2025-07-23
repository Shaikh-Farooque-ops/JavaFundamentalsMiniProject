/*
✅ 7. Mini Quiz App
Description: Show a few MCQs to the user and score them based on answers.

High-Level Steps:
Store 5 questions with options and correct answers.
Show each question one-by-one.
Take user answer and compare.
Keep score and show result at end.

Future Enhancement:
Add option to replay the quiz
*/

package com.ferry.practice.fundamentals;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		
		int score=0;
		
		Scanner scanner = new Scanner(System.in);

		String[] questions = { "1. Who invented Java Programming?", 
							   "2. Which statement is true about Java?",
							   "3. Which component is used to compile, debug and execute the java programs?",
							   "4. Which one of the following is not a Java feature?",
							   "5. Which of these cannot be used for a variable name in Java?"
							 };
		
		String[][] options = {
								 {"a) Guido van Rossum","b) James Gosling","c) Dennis Ritchie","d) Bjarne Stroustrup"},
								 {"a) Java is a sequence-dependent programming language","b) Java is a code dependent programming language","c) Java is a platform-dependent programming language","d) Java is a platform-independent programming language"},
								 {"a) JRE","b) JIT","c) JDK","d) JVM"},
								 {"a) Object-oriented","b) Use of pointers","c) Portable","d) Dynamic and Extensible"},
								 {"a) identifier & keyword","b) identifier","c) keyword","d) none of the mentioned"}
							 };
		
		char[] answer = {'b','d','c','b','c'};
		
		
		for(int i=0;i<questions.length;i++)
		{
			System.out.println(questions[i]);
			
			for(String values : options[i])
			{
				System.out.println(values);
			}
			
			System.out.print("Choose your Answer :");
			char res = scanner.next().charAt(0);
			
			if(res == answer[i]) 
			{
				System.out.println("Correct!");
				System.out.println("--------------------------------------------------");
		        score++;
			}
			
			else
			{
				System.out.println("Incorrect! Correct answer is:" + answer[i]);
				System.out.println("--------------------------------------------------");

			}
		}
		
		if(score == 5) System.out.println("Excellent! 🌟");
		else if(score >= 3) System.out.println("Good job! 👍");
		else System.out.println("Keep practicing! 💪");

		
		System.out.println("Your Score: " + score + " out of 5");
		
		System.out.println("Thank you for playing the Quiz! 👋");
		
		scanner.close();
		
	}

}
