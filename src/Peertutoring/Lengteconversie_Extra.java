package Peertutoring;

import java.util.Scanner;

public class Lengteconversie_Extra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wilt u van Celcius naar Fahrenheit (keuze CF) of van Fahrenheit naar Celcius (Keuze FC)");
		String choice = scanner.next();

		while (!(choice.equals("CF") || choice.equals("FC"))) {
			System.out.print("Dit is een foute keuze, kies uit CF of FC: ");
			choice = scanner.next();
		}

		if (choice.equals("CF")) {
			System.out.print("Geef de begintemperatuur in °C: ");
			int startTemp = scanner.nextInt();

			System.out.print("Geef de eindtemperatuur in °C: ");
			int endTemp = scanner.nextInt();

			System.out.print("Geef de stapwaarde: ");
			int steps = scanner.nextInt();

			System.out.println("=================");
			System.out.printf("| %-5s | %5s |%n", "°C", "°F");
			System.out.printf("| ------------- |%n");

			while (startTemp <= endTemp) {
				System.out.printf("| %5s | %-5s |%n", startTemp, convertToFahrenheit(startTemp));
				startTemp += steps;
			}

			System.out.println("=================");

		} else {
			System.out.print("Geef de begintemperatuur in °F: ");
			int startTemp = scanner.nextInt();

			System.out.print("Geef de eindtemperatuur in °F: ");
			int endTemp = scanner.nextInt();

			System.out.print("Geef de stapwaarde: ");
			int steps = scanner.nextInt();

			System.out.println("=================");
			System.out.printf("| %-5s | %5s |%n", "°F", "°C");
			System.out.printf("| ------------- |%n");

			while (startTemp <= endTemp) {
				System.out.printf("| %5s | %-5s |%n", startTemp, convertToCelcius(startTemp));
				startTemp += steps;
			}

			System.out.println("=================");
		}
	}

	public static double convertToCelcius(double fahrenheit) {
		return (fahrenheit - 32) * ((double) 5 / 9);
	}

	public static double convertToFahrenheit(double celcius) {
		return celcius * ((double) 9 / 5) + 32;
	}
}
