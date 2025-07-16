/*

✅ 5. Word Counter (String Project)
Description: Count number of words, vowels, consonants, and spaces in a sentence.

High-Level Steps:
Take a sentence input from user.
Traverse character by character.
Use conditions to classify and count characters.
Show total words, vowels, consonants, etc.

Future Enhancement:
Add punctuation or digit counters

*/

package com.ferry.practice.fundamentals;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {

		int vowelsCounter = 0, consonantsCounter = 0, spaceCounter = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Senetence :");
		String sen = scanner.nextLine();

		for (int i = 0; i < sen.length(); i++) {

			Character ch = sen.toLowerCase().charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCounter++;
			}

			else if (ch >= 'a' && ch <= 'z') {
				consonantsCounter++;
			}

			else if (ch == ' ') {
				spaceCounter++;
			}
		}

		Scanner sc = new Scanner(sen);
		int wordCount = 0;
		while (sc.hasNext()) {
			sc.next();
			wordCount++;
		}

		System.out.println("Vowels Counts :" + vowelsCounter);
		System.out.println("Consonants Counts :" + consonantsCounter);
		System.out.println("Words Counts :" + wordCount);
		System.out.println("Space Counts :" + spaceCounter);

		scanner.close();
	}

}
