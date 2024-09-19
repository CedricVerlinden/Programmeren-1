package Week1;

import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentYear = LocalDate.now().getYear();

		System.out.print("Wat is je naam? ");
		String name = scanner.next();

		System.out.print("Beste " + name + ", geef je geboortejaar: ");
		int year = scanner.nextInt();

		System.out.println("Als alles goed loopt, word je dit jaar " + (currentYear - year));
	}
}
