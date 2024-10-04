package Week3;

import java.util.Scanner;

public class Sparen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef het bedrag: ");
		double amount = scanner.nextDouble();

		System.out.print("Geef het percentage: ");
		double percentage = scanner.nextDouble() / 100;

		for (int i = 1; i <= 10; i++) {
			amount += amount * percentage;
			System.out.printf("Bedrag na %d jaar: %.2f%n", i, amount);
		}
	}
}
