package Week3;

import java.util.Scanner;

public class Kerstboom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef de breedte de van kerstboom (oneven getal in bereik 13..29): ");
		int width = scanner.nextInt();

		System.out.println();
		for (int i = 1; i < width; i+=2) {
			int spaces = width - i / 2;
			System.out.print(" ".repeat(spaces) + "*".repeat(i) + " ".repeat(spaces) + "\n");
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(" ".repeat(width - 3 / 2) + "***");
		}
	}
}
