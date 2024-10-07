package Peertutoring;

import java.util.Scanner;

public class Lengteconversie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversie Lengte - Eenheiden");
		System.out.println("=============================");

		int choice = -1;
		while (choice != 0) {
			System.out.println("Welke conversie wil je doen?");
			System.out.println(
					"1) Inches naar Centimeters\n" +
							"2) Centimeters naar Inches\n" +
							"3) Feet naar Centimeters\n" +
							"0) Afsluiten"
			);
			choice = scanner.nextInt();

			while (!(choice == 1 || choice == 2 || choice == 3 | choice == 0)) {
				System.out.print("Dit is geen geldige keuze, kies tussen 1, 2, 3 of 0: ");
				choice = scanner.nextInt();
			}

			switch (choice) {
				case 1 -> {
					System.out.print("Geef de waarde in inches: ");
					double inches = scanner.nextDouble();

					System.out.printf(inches + " inches = %.2f centimeters%n", inchToCm(inches));
				}
				case 2 -> {
					System.out.print("Geef de waarde in centimers: ");
					double centimeters = scanner.nextDouble();

					System.out.printf(centimeters + " centimeters = %.2f inches%n", cmToInch(centimeters));
				}
				case 3 -> {
					System.out.print("Geef de waarde in feet: ");
					double feet = scanner.nextDouble();

					System.out.printf(feet + " feet = %.2f centimeters%n", feetToCm(feet));
				}
				case 0 -> System.out.println("Tot ziens!");
			}
		}
	}

	public static double inchToCm(double inch) {
		return inch * 2.54;
	}

	public static double cmToInch(double cm) {
		return cm / 2.54;
	}

	public static double feetToCm(double feet) {
		return feet * 30.48;
	}
}
