package Week3;

import java.util.Scanner;

public class Rangschikken {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Hoeveel voorwerpen? ");
		int amount = scanner.nextInt();

		System.out.println(faculteit(amount));
	}

	public static int faculteit(int j) {
		int total = 2;
		for (int i = 3; i <= j; i++) {
			total *= i;
		}

		return total;
	}
}
