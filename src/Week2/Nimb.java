package Week2;

import java.util.Random;
import java.util.Scanner;

public class Nimb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int starting = 21;
		int min = 1;
		int max = 3;

		System.out.println("----------------------------------------");
		System.out.println("🔢 Nimb");
		System.out.println("Er zijn in totaal 21 lucifers, je mag 1, 2 of 3 lucifers pakken" + "per beurt. diegene die de laatste lucifer neemt heeft verloren.");
		System.out.println("----------------------------------------");

		System.out.print("Voor dat we kunnen beginnen, moeten jij eerst kiezen wie er begint (ik,computer): ");
		String choice = scanner.next();
		while (!choice.equals("ik") && !choice.equals("computer")) {
			System.out.print("Je moet kiezen tussen \"ik\" of \"computer\": ");
			choice = scanner.next();
		}

		boolean isComputer = choice.equals("computer");
		do {
			System.out.println("----------------------------------------");

			if (isComputer) {
				int chosenNumber = new Random().nextInt(min, max);
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
	}
}
