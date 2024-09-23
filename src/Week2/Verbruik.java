package Week2;

import java.util.Scanner;

public class Verbruik {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef de vorige kilometerstand: ");
		int previous = scanner.nextInt();

		System.out.print("Geef de huidige kilometerstand: ");
		int current = scanner.nextInt();

		System.out.print("Geef het aantal getankte liters: ");
		double tankedLiters = scanner.nextDouble();

		int drivenDistance = current - previous;
		double consumptionPer100Km = (tankedLiters / drivenDistance) * 100;
		System.out.printf("Verbruik voor " + (current-previous) + "km: %.2f liter/100km", consumptionPer100Km);
	}
}
