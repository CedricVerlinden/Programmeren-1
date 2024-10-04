package Peertutoring;

import java.util.Scanner;

public class Temperatuurconversie_Extra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversietabel °C naar °F");
		System.out.println("=========================");

		System.out.print("Geef de begintemperatuur in °C: ");
		double begin = scanner.nextDouble();

		System.out.print("Geef de eindtemperatuur in °C: ");
		double end = scanner.nextDouble();

		if (end < begin) {
			System.out.println("De eindtemperatuur moet hoger zijn dan de begin temperatuur.");
			return;
		}

		System.out.print("Geef de stapwaarde: ");
		int step = scanner.nextInt();

		System.out.println("===============");
		System.out.printf("| %-4s | %4s |%n", "°C", "°F");
		System.out.printf("| ----------- |%n");

		while (begin <= end) {
			System.out.printf("| %4s | %-4s |%n", (int) begin, convertToFahrenheit(begin));
			begin+=step;
		}

		System.out.println("===============");
	}

	public static double convertToFahrenheit(double celcius) {
		return celcius * ((double) 9 / 5) + 32;
	}
}
