package Week1;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		int n1 = scanner.nextInt();

		System.out.print("Geef nog een getal: ");
		int n2 = scanner.nextInt();

		System.out.print("Geef een laatste getal: ");
		int n3 = scanner.nextInt();

		System.out.println("Het product is " + (n1 * n2 * n3));
	}
}
