package Peertutoring;

import java.util.Scanner;

public class Temperatuurconversie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;

		System.out.println("Conversie graden Celsius - Fahrenheit");
		System.out.println("=====================================");


		while (choice != 0) {
			System.out.println("Welke conversie wens je te doen?");
			System.out.println("  1) °C naar °F");
			System.out.println("  2) °F naar °C");
			System.out.print("Uw keuze? ");
			choice = scanner.nextInt();

			if (choice == 1) {
				System.out.print("Geef de waarde in °C: ");
				int temp = scanner.nextInt();
				System.out.println(temp + "°C = " + convertToFahrenheit(temp));
			} else if (choice == 2) {
				System.out.print("Geef de waarde in °F: ");
				int temp = scanner.nextInt();
				System.out.println(temp + "°C = " + convertToCelcius(temp));
			}
		}

		System.out.println("Tot ziens!");
	}

	public static double convertToCelcius(double fahrenheit) {
		return (fahrenheit-32)*((double) 5 /9);
	}

	public static double convertToFahrenheit(double celcius) {
		return celcius*((double) 9/5)+32;
	}
}
