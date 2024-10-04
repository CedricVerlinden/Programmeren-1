package Week3;

import java.util.Scanner;

public class opdracht_1_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Wat is de graad? ");
		int grade = scanner.nextInt();

		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}
