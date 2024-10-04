package Peertutoring;

import java.util.Scanner;

public class Lengteconversie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversies");
		System.out.println("==========");

		System.out.print("Geef de te converteren eenheid: ");
		String convertFrom = scanner.next();

		System.out.print("Geef de eenheid naar waar geconverteerd wordt: ");
		String convertTo = scanner.next();

		System.out.print("Geef de waarde van a: ");
		double valueOfA = scanner.nextDouble();

		System.out.print("Geef de waarde van b: ");
		double valueOfB = scanner.nextDouble();

		System.out.print("Geef de startwaarde in inch: ");
		int beginValue = scanner.nextInt();

		System.out.print("Geef de eindwaarde in inch: ");
		int endValue = scanner.nextInt();

		System.out.print("Geef de stapwaarde: ");
		int step = scanner.nextInt();

		System.out.println("=================");
		System.out.printf("| %-5s | %5s |%n", convertFrom, convertTo);
		System.out.printf("| ------------- |%n");

		while (beginValue <= endValue) {
			System.out.printf("| %5s | %-5s |%n", beginValue, (valueOfA * beginValue + valueOfB));
			beginValue += step;
		}

		System.out.println("=================");
	}
}
