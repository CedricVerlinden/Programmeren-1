package Peertutoring.Hartslagzones;

import java.util.Scanner;

public class Hartslagzones_Deel2 {

	// Weird as shit part 2

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Is de HRR al gekend? ");
		String HRRChoice = scanner.next().toUpperCase();
		char letter = HRRChoice.charAt(0);

		while (!(letter == 'J' || letter == 'N')) {
			System.out.print("Ongeldige ingave: ");
			letter = scanner.next().toUpperCase().charAt(0);
		}

		if (letter == 'J') {
			System.out.print("Geef de HRR in: ");
			double HRR = scanner.nextDouble();
		}

		System.out.println("Ga even rustig zitten en adem 10x diep en in uit.\nIndien je klaar bent type je ok.");
		String confirmation = scanner.next();

		while (!(confirmation.equalsIgnoreCase("ok"))) {
			System.out.print("Ongeldige ingave: ");
			confirmation = scanner.next();
		}

		int restingBeats = countHeartrate(2);

		System.out.println();
		System.out.println(
				"Interval 1: Ren 30 seconden op volle snelheid.\n" +
						"Herstelperiode 1: Rust 60 seconden.\n" +
						"Interval 2: Ren 30 seconden op volle snelheid.\n" +
						"Herstelperiode 2: Rust 60 seconden.\n" +
						"Interval 3: Ren 60 seconden op volle snelheid."
		);

		int maxBeats = countHeartrate(2);

		int actualHRR = maxBeats - restingBeats;
		System.out.println("Jouw HRR is " + actualHRR);

		System.out.print("Ben je een beginnende of een gevorderde? ");
		String level = scanner.next();

		while (!(level.equalsIgnoreCase("B") || level.equalsIgnoreCase("G"))) {
			System.out.print("Ongeldige ingave: ");
			level = scanner.next();
		}

		System.out.print("De hoeveelste dag voer je dit uit? ");
		int day = scanner.nextInt();

		if (level.equalsIgnoreCase("B")) {
			getSchemeForBeginner(day);
		} else {
			getSchemeForAdvanced(day);
		}
	}

	public static void getSchemeForBeginner(int day) {
		day -= 1;

		int run = 10;
		int sprint = 20;
		int walkOne = 40;
		int walkTwo = 10;

		double extra = day * 0.10;
		System.out.println(
				"1. " + (run + (int) extra) + " minuten lopen tussen de limieten van zone 3 tot en met 4\n" +
				"2. " + (sprint + (int) extra) + " seconden hardlopen in zone 5\n" +
				"3. Wandelen tot dat de bovengrens van zone 2 bereikt is\n" +
				"4. " + (walkOne + (int) extra) + " seconden wandelen/joggen tussen de limieten van zone 1 tot en met 2\n" +
				"5. " + (walkTwo + (int) extra) + " minuten wandelen/joggen in zone 2"
		);
	}

	public static void getSchemeForAdvanced(int day) {
		day -= 1;

		int run = 10;
		int sprint = 20;
		int walkOne = 40;
		int walkTwo = 10;

		double extra = day * 0.10;
		System.out.println(
				"1. " + (run + extra) + " minuten lopen tussen de limieten van zone 3 tot en met 4\n" +
				"2. " + (sprint + extra) + " seconden hardlopen in zone 5\n" +
				"3. Wandelen tot dat de bovengrens van zone 2 bereikt is\n" +
				"4. " + (walkOne + extra) + " seconden wandelen/joggen tussen de limieten van zone 1 tot en met 2\n" +
				"5. " + (walkTwo + extra) + " minuten wandelen/joggen in zone 2 tem zone 3"
		);
	}

	public static int countHeartrate(int seconds) {
		System.out.println("start");
		while (seconds > 0) {
			try {
				if (seconds == 1) {
					System.out.println("stop");
					seconds--;
					continue;
				}
				System.out.print(seconds);
				System.out.print(" - ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seconds--;
		}

		System.out.println("Geef het aantal slagen in: ");
		return scanner.nextInt() * 4;
	}

	public static int[] getZoneRates(int zone, int HRR, int resting) {
		int lower = 0, upper = 0;
		switch (zone) {
			case 1 -> {
				lower = (int) (HRR * (0.5) + resting);
				upper = (int) (HRR * (0.6) + resting);
			}
			case 2 -> {
				lower = (int) (HRR * (0.6) + resting);
				upper = (int) (HRR * (0.7) + resting);
			}
			case 3 -> {
				lower = (int) (HRR * (0.7) + resting);
				upper = (int) (HRR * (0.8) + resting);
			}
			case 4 -> {
				lower = (int) (HRR * (0.8) + resting);
				upper = (int) (HRR * (0.9) + resting);
			}
			case 5 -> {
				lower = (int) (HRR * (0.9) + resting);
				upper = (int) (HRR + resting);
			}
		}

		return new int[]{lower, upper};
	}
}
