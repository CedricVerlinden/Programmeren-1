package Week2;

import java.util.Scanner;

public class Korting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef het bedrag: ");
		int amount = scanner.nextInt();

		System.out.print("Geef het aantal artikelen: ");
		int articleAmount = scanner.nextInt();

		boolean getsDiscount = (amount > 150 && (articleAmount >= 10 && articleAmount <= 20)) || articleAmount > 100;

		System.out.println("De klant krijg " + (getsDiscount ? "WEL" : "GEEN") + " korting");
	}
}
