package Week3;

import java.util.Scanner;

public class ExtraUitdaging {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int choice = 1;
		while (!(choice == 2)) {
			int person = 0;
			int computer = 0;
			boolean isPerson = rolDobbelsteen(2) == 1;

			System.out.println("Welkom, wie het eerst 101 gooit heeft gewonnen. Je verliest je beurt wanneer je een 6 gooit.");

			while (!(person >= 101 || computer >= 101)) {
				System.out.println("Druk op <enter> om de dobbelsteen te gooien");
				scanner.nextLine();
				int rolled = rolDobbelsteen(16);
				if (isPerson) {
					person += rolled;
				} else {
					computer += rolled;
				}

				if (rolled == 6) {
					if (isPerson) {
						person = 0;
					} else {
						computer = 0;
					}
					isPerson = !isPerson;
				}
				System.out.println("Je hebt een " + rolled + " gerolled." + (rolled == 6 ? " Das pech, punten weg. De beurt is aan " + (isPerson ? "jouw" : "de computer") : ""));
				System.out.println("Je hebt " + (isPerson ? person : computer) + " punten.");

			}

			System.out.println((person == 101 ? "Jij bent" : "De computer heeft") + " gewonnen!");
			System.out.print("Wil je nog een spelen? (1=ja/2=nee): ");
			choice = scanner.nextInt();
		}
	}

	public static int rolDobbelsteen(int sides) {
		return (int) (Math.random() * sides + 1);
	}
}
