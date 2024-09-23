package Week2;

import java.util.Scanner;

public class Calorieën {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long GEMIDDELDE_CALORIEEN;
		long CALORIEEN_IN_PIZZA;

		System.out.print("Geef de naam van het land: ");
		String country = scanner.next();

		System.out.print("Hoeveel mensen wonen er in " + country + "? ");
		int population = scanner.nextInt();

		while (population < 999999) {
			System.out.print("Fout! Dat is een veel te klein getal... ");
			population = scanner.nextInt();
		}

		GEMIDDELDE_CALORIEEN = population * 2256L;
		CALORIEEN_IN_PIZZA = GEMIDDELDE_CALORIEEN / 906;

		System.out.println("In België verbruiken alle inwoners samen " + GEMIDDELDE_CALORIEEN + " calorieën per dag.");
		System.out.println("Dat komt overeen met " + CALORIEEN_IN_PIZZA + " pizza's per dag.");
	}
}
