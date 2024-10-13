package Peertutoring.Hartslagzones;

import java.util.Scanner;

public class Hartslagzones {

	// Weird as shit

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
		System.out.print("In welke zone wil je trainen? ");
		int zone = scanner.nextInt();

		int lower = 0, upper = 0;
		switch (zone) {
			case 1 -> {
				lower = (int) (actualHRR * (0.5) + restingBeats);
				upper = (int) (actualHRR * (0.6) + restingBeats);
			}
			case 2 -> {
				lower = (int) (actualHRR * (0.6) + restingBeats);
				upper = (int) (actualHRR * (0.7) + restingBeats);
			}
			case 3 -> {
				lower = (int) (actualHRR * (0.7) + restingBeats);
				upper = (int) (actualHRR * (0.8) + restingBeats);
			}
			case 4 -> {
				lower = (int) (actualHRR * (0.8) + restingBeats);
				upper = (int) (actualHRR * (0.9) + restingBeats);
			}
			case 5 -> {
				lower = (int) (actualHRR * (0.9) + restingBeats);
				upper = (int) (actualHRR + restingBeats);
			}
		}

		System.out.printf("Jouw hartslag limiet ligt tussen %d en %d", lower, upper);
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
}
