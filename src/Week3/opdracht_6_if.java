package Week3;

import java.util.Scanner;

public class opdracht_6_if {

	public static void main(String[] args) {

		// Opdracht 1
//		for (int i = 0; i < 10000; i++) {
//			if (i % 6 == 0 && i % 28 == 0) {
//				System.out.println(i);
//			}
//		}

		// Opdracht 2
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		int n = scanner.nextInt();

		boolean isPrime = n != 0 && n != 1;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Dit is een priemgetal");
		} else {
			System.out.println("Dit is geen priemgetal");
		}
	}
}
