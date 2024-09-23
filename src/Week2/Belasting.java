package Week2;

import java.util.Scanner;

public class Belasting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef het BTW percentage: ");
		int percentage = scanner.nextInt();

		System.out.print("Geef het bedrag in €: ");
		int amount = scanner.nextInt();

		System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief) ");
		int choice = scanner.nextInt();

		switch (choice) {
			case 1 -> {
				int btw = amount * percentage / (100 + percentage);
				System.out.println("€" + (amount - btw) + " + " + percentage + "% BTW = €" + (amount));
			}
			case 2 -> {
				int btw = amount * percentage / 100;
				System.out.println("€" + amount + " + " + percentage + "% BTW = €" + (amount + btw));
			}
		}
	}
}
