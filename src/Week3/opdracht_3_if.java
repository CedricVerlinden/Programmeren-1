package Week3;

import java.util.Scanner;

public class opdracht_3_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een woord? ");
		String word = scanner.next().toUpperCase();

		int total = 0;
		for (char c : word.toCharArray()) {
			switch (c) {
				case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R' -> total += 1;
				case 'D', 'G' -> total += 2;
				case 'B', 'C', 'M', 'P' -> total += 3;
				case 'F', 'H', 'V', 'W', 'Y' -> total += 4;
				case 'K' -> total += 5;
				case 'J', 'X' -> total += 8;
				case 'Q', 'Z' -> total += 10;
			}
		}

		System.out.println("Totaal aantal punten " + total);
	}
}
