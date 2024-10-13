package Week5;

import java.util.Scanner;

public class GrafischeRekenmachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef de minimum x-waarde: ");
		double minX = scanner.nextDouble();

		System.out.print("maximum x-waarde: ");
		double maxX = scanner.nextDouble();

		System.out.println("Welke curve wil je tekenen?");
		System.out.println("1 = sinus");
		System.out.println("2 = cosinus hyperbolicus");
		System.out.println("3 = wortel");
		System.out.print("Jouw keuze: ");
		int choice = scanner.nextInt();

		while (!(choice == 1 || choice == 2 || choice == 3)) {
			System.out.print("Ongeldige ingaven: ");
			choice = scanner.nextInt();
		}

		int steps = 20;
		double stepSize = (maxX - minX) / steps;
		for (int i = 0; i <= steps; i++) {
			double x = minX + i * stepSize;
			double y;

			switch (choice) {
				case 1:
					y = 10 * Math.sin(x) + 10;
					break;
				case 2:
					y = 10 * Math.cosh(x);
					break;
				case 3:
					y = Math.sqrt(10 * x);
					break;
				default:
					System.out.println("Onbekende curve.");
					return;
			}

			int yInt = (int) Math.round(y);
			System.out.println(" ".repeat(yInt) + "*\n");
		}
	}
}
