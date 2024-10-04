package Week2;

import java.util.Scanner;

public class NaarDecimaal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		String number = scanner.next();

		System.out.print("Geef het talstelsel: ");
		int system = scanner.nextInt();

		int resultaat = 0;
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			int value  = c - '0';
			resultaat = resultaat * system + value;
		}

		System.out.println("Het getal [" + number + "]" + system + " is gelijk aan " + resultaat);
	}
}
