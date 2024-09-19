package Week1;

import java.util.Random;
import java.util.Scanner;

public class HogerLager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean playAgain;
		do {
			int random = new Random().nextInt(1, 100);
			System.out.println("--------------------");
			System.out.println("Hoger Lager");
			System.out.println("Probeer het getal te raden tussen 1 en 100 (inclusief)!");
			System.out.println("--------------------");

			int guess;
			do {
				System.out.print("Gok het getal: ");
				guess = scanner.nextInt();

				if (guess < random) {
					System.out.println("Te klein, probeer het opnieuw");
				}

				if (guess > random) {
					System.out.println("Te groot, probeer het opnieuw");
				}
			} while (guess != random);

			System.out.println("Yes, je hebt het getal geraden!");
			System.out.println("Wil je nog een spelen? (yes/no)");
			String answer = scanner.next();

			playAgain = answer.equals("yes");

		} while (playAgain);
	}
}
