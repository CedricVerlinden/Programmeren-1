package Week1;

import java.util.Scanner;

public class Middelste {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;

		while (true) {
			System.out.print("Geef het eerste getal (1..100): ");
			n1 = scanner.nextInt();

			if (n1 >= 1 && n1 <= 100) {
				break;
			}

			System.out.println("Het getal moet tussen 1 en 100 liggen!");
		}

		while (true) {
			System.out.print("Geef het tweede getal (1..100): ");
			n2 = scanner.nextInt();

			if (n2 >= 1 && n2 <= 100) {
				break;
			}

			System.out.println("Het getal moet tussen 1 en 100 liggen!");
		}

		while (true) {
			System.out.print("Geef het derde getal (1..100): ");
			n3 = scanner.nextInt();

			if (n3 >= 1 && n3 <= 100) {
				break;
			}

			System.out.println("Het getal moet tussen 1 en 100 liggen!");
		}

		System.out.println("Het middelste getal is " + median(n1, n2, n3));
		System.out.println("Einde programma!");
	}

	public static int median(int a, int b, int c) {
		if ( (a - b) * (c - a) >= 0 )
			return a;
		else if ( (b - a) * (c - b) >= 0 )
			return b;
		else
			return c;
	}
}