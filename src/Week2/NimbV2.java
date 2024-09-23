package Week2;

import java.util.Random;
import java.util.Scanner;

public class NimbV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean playAgain = false;
		int starting;
		int min = 1;
		int max;

		System.out.println("----------------------------------------");
		System.out.println("🔢 Nimb");
		System.out.println("Er zijn in totaal 21 lucifers, je mag 1, 2 of 3 lucifers pakken" + "per beurt. diegene die de laatste lucifer neemt heeft verloren.");
		System.out.println("----------------------------------------");

		do {
			System.out.println("Voor dat we kunnen beginnen, rol ik een dobbelsteen om te beslissen wie er begint. Als ik 1-3 rol begin jij, 4-6 begin ik. Veel succes!");

			int rollResult = random.nextInt(1, 6);
			System.out.println("Het resultaat van de gooi is " + rollResult + ", " + ((rollResult >= 1 && rollResult <= 3) ? "jij begint." : "ik begin."));

			System.out.print("Hoeveel lucifers mag je maximaal pakken per beurt? ");
			max = scanner.nextInt();

			System.out.print("Met hoeveel lucifers wil je beginnen? (min. " + (max * 5) + ") ");
			starting = scanner.nextInt();
			while (starting < (max * 5)) {
				System.out.print("Het totaal aantal lucifers moet minstens 5 keer zoveel zijn als de max aantal te pakken lucifers. ");
				starting = scanner.nextInt();
			}

			boolean isComputer = (rollResult >= 4 && rollResult <= 6);
			do {
				System.out.println("----------------------------------------");

				if (isComputer) {
					int chosenNumber = random.nextInt(min, max);
					System.out.println();
					System.out.println("💻 | Het is aan mij, ik kies " + chosenNumber + " " + (chosenNumber == 1 ? "lucifer" : "lucifers"));
					starting -= chosenNumber;

					System.out.println();
					if (starting <= 0) {
						break;
					}
					System.out.println("🤖 | Er " + (starting == 1 ? "is" : "zijn") + " nu nog maar " + starting + " " + (starting == 1 ? "lucifer" : "lucifers"));
					isComputer = false;
					continue;
				}

				System.out.print("Het is jou beurt, kies een getal tussen 1 en 3 (inclusief): ");
				int chosenNumber = scanner.nextInt();
				while (chosenNumber < min || chosenNumber > max) {
					System.out.print("Een getal tussen 1 en 3 inclusief: ");
					chosenNumber = scanner.nextInt();
				}

				System.out.println("🤖 | Je hebt " + chosenNumber + " " + (chosenNumber == 1 ? "lucifer" : "lucifers") + " gepakt.");
				starting -= chosenNumber;

				System.out.println();
				if (starting <= 0) {
					break;
				}
				System.out.println("🤖 | Er " + (starting == 1 ? "is" : "zijn") + " nu nog maar " + starting + " " + (starting == 1 ? "lucifer" : "lucifers"));

				isComputer = true;
			} while (true);

			if (isComputer) {
				System.out.println("💻 | Agggh! Jij hebt gewonnen...");
			} else {
				System.out.println("💻 | HAHAHA YES!! Volgende keer beter!");
			}

			System.out.print("\nWil je nog een keer spelen? (y/n) ");
			String choice = scanner.next();

			playAgain = choice.equals("y");
		} while (playAgain);

		System.out.println("Bedankt voor het spelen.");
	}
}
