package Peertutoring;

import java.util.Scanner;

public class Lengteconversie_Deel2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversie Lengte - Eenheiden");
		System.out.println("=============================");

		System.out.print("Geef de beginafstand in inches: ");
		double start = scanner.nextDouble();

		System.out.print("Geef de eindafstand in inches: ");
		double end = scanner.nextDouble();

		System.out.print("Geef de stapgrootte: ");
		int steps = scanner.nextInt();

		while (start <= end) {
			System.out.printf(start + " inches = %.1f centimeters = %.2f feet%n", inchToCm(start), inchToFeet(start));
			start += steps;
		}
	}

	public static double inchToCm(double inch) {
		return inch * 2.54;
	}

	public static double inchToFeet(double inch) {
		return inch / 12;
	}
}
