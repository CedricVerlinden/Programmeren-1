package Week1;

import java.util.Scanner;

public class Bewerkingen {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		int n1 = scanner.nextInt();

		System.out.print("Geef nog een getal: ");
		int n2 = scanner.nextInt();

		System.out.println("Kies een bewerking:");
		System.out.println("1. Optellen");
		System.out.println("2. Aftrekken");
		System.out.println("3. Vermenigvuldigen");
		System.out.println("4. Delen");
		System.out.print("Jouw keuze: ");
		int choice = scanner.nextInt();

		switch(choice) {
			case 1 -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			case 2 -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			case 3 -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			case 4 -> System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			default -> System.out.println("Ongeldige keuze.");
		}
	}
}