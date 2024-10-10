package Week4.SmartLights;

import java.util.Scanner;

public class SmartLights {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lamp livingLamp = new Lamp();
		Lamp keukenLamp = new Lamp();
		Lamp slaapkamerLamp = new Lamp();

		int choice = -1;
		while (!(choice == 5)) {
			System.out.println("Wat wil je doen?");
			System.out.println("1  Alle lampen aan");
			System.out.println("2  Alle lampen uit");
			System.out.println("3  Living en keuken aan (slaapkamer gaat uit)");
			System.out.println("4  Slaapkamer aan (living en keuken gaan uit)");
			System.out.println("5  Stoppen");
			System.out.print("Jouw keuze: ");
			choice = scanner.nextInt();

			while (!(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5)) {
				System.out.print("Ongeldige keuze: ");
				choice = scanner.nextInt();
			}

			switch (choice) {
				case 1 -> {
					livingLamp.zetAan();
					System.out.println("- lamp in de living: " + livingLamp.getStatus());

					keukenLamp.zetAan();
					System.out.println("- lamp in de keuken: " + keukenLamp.getStatus());

					slaapkamerLamp.zetAan();
					System.out.println("- lamp in de slaapkamer: " + slaapkamerLamp.getStatus());

					System.out.println();
				}
				case 2 -> {
					livingLamp.zetUit();
					System.out.println("- lamp in de living: " + livingLamp.getStatus());

					keukenLamp.zetUit();
					System.out.println("- lamp in de keuken: " + keukenLamp.getStatus());

					slaapkamerLamp.zetUit();
					System.out.println("- lamp in de slaapkamer: " + slaapkamerLamp.getStatus());

					System.out.println();
				}
				case 3 -> {
					livingLamp.zetAan();
					System.out.println("- lamp in de living: " + livingLamp.getStatus());

					keukenLamp.zetAan();
					System.out.println("- lamp in de keuken: " + keukenLamp.getStatus());

					slaapkamerLamp.zetUit();
					System.out.println("- lamp in de slaapkamer: " + slaapkamerLamp.getStatus());

					System.out.println();
				}
				case 4 -> {
					livingLamp.zetUit();
					System.out.println("- lamp in de living: " + livingLamp.getStatus());

					keukenLamp.zetUit();
					System.out.println("- lamp in de keuken: " + keukenLamp.getStatus());

					slaapkamerLamp.zetAan();
					System.out.println("- lamp in de slaapkamer: " + slaapkamerLamp.getStatus());

					System.out.println();
				}
				case 5 -> {}
			}
		}
	}
}
