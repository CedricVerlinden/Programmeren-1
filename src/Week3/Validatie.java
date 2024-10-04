package Week3;

import java.util.Scanner;

public class Validatie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double total = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Geef het " + i + "e getal: ");
			int number = scanner.nextInt();

			while (!isValidNumber(number)) {
				System.out.print("Geef het " + i + "e getal: ");
				number = scanner.nextInt();
			}

			total += number;
		}

		System.out.println("Het gemiddelde van de vijf getallen is: " + (total / 5));
	}

	public static boolean isValidNumber(int number) {
		if (number < 0) {
			System.out.println("Getal moet positief zijn!");
			return false;
		}

		if (number > 100) {
			System.out.println("Getal moet kleiner zijn dan 100!");
			return false;
		}

		if (number > 50) {
			if (number % 2 != 0) {
				System.out.println("Getallen groter dan 50 moeten even zijn!");
				return false;
			}
		}

		return true;
	}
}
