package Week1;

import java.util.Scanner;

public class Reeksen {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hoeveel getallen wil je afdrukken? ");
		int amount = scanner.nextInt();

		System.out.print("Met welke waarde wil je starten? ");
		int start = scanner.nextInt();

		System.out.print("Met welke waarde wil je verhogen? ");
		int increment = scanner.nextInt();

		for (int i = 0; i < amount; i++) {
			System.out.print(start + " ");
			start+= increment;
		}
	}
}