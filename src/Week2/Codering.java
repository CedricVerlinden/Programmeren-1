package Week2;

import java.util.Scanner;

public class Codering {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int SHIFT = 3;

		System.out.print("Geef een bericht: ");
		String string = scanner.nextLine().toUpperCase();

		System.out.print("Wil je dit encoderen? (Y/N) ");
		String choice = scanner.next().toUpperCase();

		while (!(choice.equals("Y") || choice.equals("N"))) {
			System.out.print("Wil je dit encoderen? (Y/N) ");
			choice = scanner.next().toUpperCase();
		}

		boolean encode = (choice.equals("Y"));

		StringBuilder output = new StringBuilder();
		for (int c : string.toCharArray()) {
			if (c < 65 || c > 90) {
				output.append((char) c);
				continue;
			}

			int alphabetPosition = c - 'A';

			int partiallyShifted;
			if (encode) {
				partiallyShifted = alphabetPosition + SHIFT;
			} else {
				partiallyShifted = alphabetPosition - SHIFT;

				if (partiallyShifted < 0) {
					partiallyShifted += 26;
				}
			}

			char shifted = (char) (partiallyShifted % 26 + 'A');
			output.append(shifted);
		}
		System.out.println((encode ? "Gecodeerd" : "Gedecodeerd") + " bericht: " + output);
	}
}
