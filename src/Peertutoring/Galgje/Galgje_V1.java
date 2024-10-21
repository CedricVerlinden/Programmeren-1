package Peertutoring.Galgje;

import java.util.Scanner;

public class Galgje_V1 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Geef een woord (max 10 letters): ");
		String word = scanner.next();

		while (word.length() < 5 || word.length() > 10) {
			System.out.print("Geef een woord (max 10 letters): ");
			word = scanner.next();
		}

		String guessed;
		int i = 1;
		System.out.print("Doe een gok: ");
		guessed = scanner.next();

		while (!(guessed.equalsIgnoreCase(word))) {
			System.out.print("Fout! Doe een gok: ");
			guessed = scanner.next();
			i++;

			if (i == 5) {
				break;
			}
		}

		if (i == 5) {
			System.out.println("Je hebt het woord niet kunnen raden. Helaas!");
		} else {
			System.out.println("Proficiat, je hebt het woord geraden in " + i + " beurten!");
		}
	}
}
