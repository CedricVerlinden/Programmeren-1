package Week1;

import java.util.Scanner;

public class VakantieV2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hoeveel heeft Jürn uitgegeven? ");
		double person1 = scanner.nextDouble(); // 150

		System.out.print("Hoeveel heeft Cédric uitgegeven? ");
		double person2 = scanner.nextDouble(); // 100

		System.out.print("Hoeveel heeft Xander uitgegeven? ");
		double person3 = scanner.nextDouble();

		double total = person1 + person2 + person3;
		double perPerson = (double) Math.round((total / 3) * 100) / 100;

		System.out.println("In totaal werd er " + total + " EUR uitgegeven.");
		System.out.println("Dat is " + perPerson + " EUR per persoon.");


		double jurnBalance = perPerson - person1;
		double cedricBalance = perPerson - person2;
		double xanderBalance = perPerson - person3;

		if (jurnBalance == 0 && cedricBalance == 0 && xanderBalance == 0) {
			System.out.println("Iedereen heeft evenveel uitgegeven.");
			return;
		}

		double[] balances = {jurnBalance, cedricBalance, xanderBalance};
		String[] names = {"Jürn", "Cédric", "Xander"};

		for (int i = 0; i < 3; i++) {
			if (balances[i] > 0) {
				for (int j = 0; j < 3; j++) {
					if (balances[j] < 0 && balances[i] > 0) {
						double amount = Math.min(balances[i], -balances[j]);
						System.out.printf("%s moet %s %.2f EUR betalen.%n", names[i], names[j], amount);
						balances[i] -= amount;
						balances[j] += amount;
					}
				}
			}
		}
	}
}