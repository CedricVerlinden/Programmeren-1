package Week2;

import java.util.Scanner;

public class Autocorrect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int wordOneTotal = 0, wordTwoTotal = 0;

		System.out.print("Geef een woord: ");
		String wordOne = scanner.next();

		System.out.print("Geef nog een woord: ");
		String wordTwo = scanner.next();

		for (char c : wordOne.toCharArray()) {
			wordOneTotal += c;
		}

		for (char c : wordTwo.toCharArray()) {
			wordTwoTotal += c;
		}

		System.out.println("De afstand tussen \"" + wordOne + "\" en \"" + wordTwo + "\" is " + Math.abs(wordOneTotal - wordTwoTotal));
	}
}
