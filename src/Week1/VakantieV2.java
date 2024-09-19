package Week1;

import java.util.Scanner;

public class VakantieV2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hoeveel heeft Jürn uitgegeven? ");
		double p1 = scanner.nextDouble(); // 150

		System.out.print("Hoeveel heeft Cédric uitgegeven? ");
		double p2 = scanner.nextDouble(); // 100

		System.out.print("Hoeveel heeft Xander uitgegeven? ");
		double p3 = scanner.nextDouble();

		double total = p1 + p2 + p3;
		double perPerson = (double) Math.round((total / 3) * 100) / 100;

		System.out.println("In totaal werd er " + total + " EUR uitgegeven.");
		System.out.println("Dat is " + perPerson + " EUR per persoon.");


		double jurn = perPerson - p1; // 20
		double cedric = perPerson - p2; // 10
		double xander = perPerson - p3; // 10

		if (jurn == 0 && cedric == 0 && xander == 0) {
			System.out.println("Iedereen heeft evenveel uitgegeven.");
			return;
		}

		if (jurn < 0) {
			System.out.printf("Jürn moet %.2f EUR ontvangen.%n", Math.abs(jurn));
		} else {
			System.out.printf("Jürn moet %.2f EUR terugbetalen.%n", jurn);
		}

		if (cedric < 0) {
			System.out.printf("Cédric moet %.2f EUR ontvangen.%n", Math.abs(cedric));
		} else {
			System.out.printf("Cédric moet %.2f EUR terugbetalen.%n", cedric);
		}

		if (xander < 0) {
			System.out.printf("Xander moet %.2f EUR ontvangen.%n", Math.abs(xander));
		} else {
			System.out.printf("Xander moet %.2f EUR terugbetalen.%n", xander);
		}
	}
}