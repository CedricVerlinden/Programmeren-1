package Week1;

import java.util.Scanner;

public class Begroeting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Wat is je naam? ");
		String name = scanner.next();

		System.out.println("Welkom " + name);
	}
}
