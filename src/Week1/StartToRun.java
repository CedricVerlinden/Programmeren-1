package Week1;

import java.util.Scanner;

public class StartToRun {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.");
		System.out.print("Geef je leeftijd: ");
		int age = scanner.nextInt();

		System.out.print("Geef je hartslag in rust: ");
		int rate = scanner.nextInt();

		System.out.println(
				"Welk soort training wil je doen?\n" +
				"1 : recuperatie training \n" +
				"2 : LSD training (Long Slow Distance) \n" +
				"3 : extensieve uithouding \n" +
				"4 : intensieve uithouding \n" +
				"5 : tempo-interval \n" +
				"6 : intensieve interval "
		);
		System.out.print("Maak je keuze: ");
		int intensity = scanner.nextInt();

		switch (intensity) {
			case 1 -> intensity = 65;
			case 2 -> intensity = 70;
			case 3 -> intensity = 75;
			case 4 -> intensity = 85;
			case 5 -> intensity = 90;
			case 6 -> intensity = 95;
		}

		int maxRate = 220 - age;
		int idealRate = rate + (maxRate - rate) * intensity / 100;

		System.out.println("Je maximale hartslag is " + maxRate);
		System.out.println("Je traint best met een hartslag rond de " + idealRate);
	}
}