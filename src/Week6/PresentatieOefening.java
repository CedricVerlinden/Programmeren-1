package Week6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PresentatieOefening {

	public static void main(String[] args) {
		// Oefening 1
		String[] weekdays = new String[]{"Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag", "Zondag"};
		for (String weekday : weekdays) {
			System.out.println(weekday);
		}

		System.out.println();
		// Oefening 2
		double[] temperatures = new double[365];
		double total = 0;
		for (int i = 0; i  < 365; i++) {
			double random = new Random().nextDouble(-20, 45);
			temperatures[i] = random;
			total += random;
		}

		System.out.printf("Totaal: %.2f%n", total);
		System.out.printf("Average: %.2f", (total/temperatures.length));

		System.out.println();
		// Oefening 3
		char[] alphabet = new char[26];
		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char) ('a' + i);
		}

		for (int i = alphabet.length - 1; i >= 0; i--) {
			System.out.println(alphabet[i]);
		}

		System.out.println();
		// Oefening 4
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hoeveel woorden wil je ingeven? ");
		int amount = scanner.nextInt();

		String[] words = new String[amount];
		for (int i = 0; i < amount; i++) {
			System.out.printf("Geef woord nummer %d: ", (i+1));
			words[i] = scanner.next();
		}

		System.out.println(String.join(";", words));

		System.out.println();
		// Oefening 5
		int size = new Random().nextInt(5, 15);
		int[] numbers = new int[size];
		int steps = 2;
		for (int i = 0; i < size; i++) {
			numbers[i] = steps;
			steps+=2;
		}

		for (int i = numbers.length - 1; i > 0; i--) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		// Oefening 6
		boolean[] bigBoolean = new boolean[20000];
		boolean tracker = true;
		for (int i = 0; i < 20000; i++) {
			bigBoolean[i] = tracker;
			tracker = !tracker;
		}

		System.out.println("Even posities: ");
		for (int i = 0; i < bigBoolean.length; i+=2) {
			System.out.println(bigBoolean[i]);
		}

		System.out.println("Oneven posities: ");
		for (int i = 1; i < bigBoolean.length; i+=2) {
			System.out.println(bigBoolean[i]);
		}
	}
}
