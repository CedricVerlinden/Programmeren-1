package Week3;

import java.util.Scanner;

public class opdracht_2_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Wat is je leeftijd? ");
		int age = scanner.nextInt();

		if (age < 2) {
			System.out.println("Baby");
		} else if (age <= 12) {
			System.out.println("Kind");
		} else if (age <= 17) {
			System.out.println("Tiener");
		} else {
			System.out.println("Volwassen");
		}
	}
}
