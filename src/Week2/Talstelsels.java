package Week2;

import java.util.Scanner;

public class Talstelsels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		int number = scanner.nextInt();

		System.out.print("Geef het talstelsel: ");
		int system = scanner.nextInt();

		StringBuilder answer = new StringBuilder();
		int num = number;
		while (num > 0) {
			int rest = num % system;
			num = num / system;
			answer.append(rest);
		}

		answer.reverse();
		System.out.println("Het getal " + number + " is gelijk aan [" + answer + "]" + system);
	}
}
