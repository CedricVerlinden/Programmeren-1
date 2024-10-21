package Peertutoring.Galgje;

import java.util.ArrayList;
import java.util.Scanner;

public class Galgje_V3 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		final String HANGMAN =
				"----- \n" +
						"|   | \n" +
						"|   O \n" +
						"|  /|\\\n" +
						"|   | \n" +
						"|  / \\\n" +
						"| \n" +
						"-------";

		String[] splittedHangman = HANGMAN.split("\n");

		System.out.print("Geef een woord (max 10 letters): ");
		String word = scanner.next();

		while (word.length() < 5 || word.length() > 10) {
			System.out.print("Geef een woord (max 10 letters): ");
			word = scanner.next();
		}

		char guessedLetter;
		StringBuilder currentWord = new StringBuilder(".".repeat(word.length()));
		System.out.println("Het te zoeken woord: " + currentWord);

		int i = 0;
		while (!(currentWord.toString().equals(word))) {
			if (i == 8) {
				break;
			}

			System.out.print("Raad een letter: ");
			guessedLetter = scanner.next().toCharArray()[0];

			System.out.println(guessedLetter);

			ArrayList<Integer> offsets = indicesOf(word, guessedLetter);
			if (!(offsets.isEmpty())) {
				for (int offset : offsets) {
					System.out.println(offset);
					currentWord.deleteCharAt(offset);
					currentWord.insert(offset, guessedLetter);
				}
			}

			System.out.println("Het te zoeken woord: " + currentWord);
			for (int j = 0; j < i + 1; j++) {
				System.out.println(splittedHangman[j]);
			}
			i++;
		}

		if (i == 8) {
			System.out.println("Helaas, je hebt het woord niet geraden!");
		} else {
			System.out.println("Proficiat, je hebt het woord geraden in " + i + " beurten!");
		}
	}

	public static ArrayList<Integer> indicesOf(String s, char c) {
		ArrayList<Integer> indices = new ArrayList<>();
		int i = 0;
		for (char c1 : s.toCharArray()) {
			if (c1 == c) {
				indices.add(i);
			}

			i++;
		}

		return indices;
	}
}
