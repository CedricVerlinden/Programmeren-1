package Peertutoring;

import java.util.*;

public class DigitalVerslaving {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> questions = new ArrayList<>(Arrays.asList(
				"Het laatste wat ik doe -voor ’s avonds het licht uit gaat- is nog snel even kijken of er nog iets\n" +
						"aan berichten, enz is binnengekomen op mijn smartphone.",
				"Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn\n" +
						"binnengekomen op mijn smartphone.",
				"Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn\n" +
						"smartphone.",
				"Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen\n" +
						"de minuut op mijn smartphone wat het precies is.",
				"Terwijl is naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere\n" +
						"keren mijn smartphone.",
				"Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens\n" +
						"de maaltijd.",
				"Als ik in gezelschap -familie, vrienden,… eet (ontbijt/lunch/diner) gebruik ik meermaals\n" +
						"mijn smartphone tijdens de maaltijd.",
				"Als ik sta te wachten (op een bus, trein, tram, een vriend(in),..), gebruik ik mijn smartphone",
				"Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld\n" +
						"naar het scherm.",
				"Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar\n" +
						"het scherm te kijken."
		));

		int yesCount = 0;
		for (String question : questions) {
			System.out.println("VRAAG | " + question);
			System.out.print("Antwoord: ");
			String answer = scanner.next().toUpperCase();

			while (!(answer.equals("JA") || answer.equals("NEE"))) {
				System.out.println("!!! | Je moet antwoorden met 'Ja' of 'Nee'");
				System.out.print("Antwoord: ");
				answer = scanner.next().toUpperCase();
			}

			yesCount += (answer.equals("JA") ? 1 : 0);
			System.out.println();
		}

		System.out.print("RESULTAAT | ");
		switch (yesCount) {
			case 0 -> System.out.println("Je bent niet digitaal verslaafd. Houden zo!");
			case 1, 2 -> System.out.println("Je hebt een milde vorm van digitale\n" +
					"verslaving");
			case 3, 4, 5 -> System.out.println("Je hebt een niet te onderschatten vorm van\n" +
					"digitale verslaving. Leg jezelf wat beperkingen op");
			case 6, 7, 8 -> System.out.println("Je hebt een ernstige vorm van digitale verslaving.\n" +
					"Overweeg om een digitale detox-cursus te volgen");
			default -> System.out.println("Je hebt een extreme vorm van digitale\n" +
					"verslaving. Je hebt waarschijnlijk professionele hulp nodig");
		}
	}
}
