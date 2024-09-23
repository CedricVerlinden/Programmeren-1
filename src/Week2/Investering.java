package Week2;

import java.util.Scanner;

public class Investering {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Wat is je initiële investering? ");
		int initialInvestment = scanner.nextInt();

		System.out.print("Wat is het jaarlijkse rentepercentage? (in %) ");
		int yearlyPercentage = scanner.nextInt();

		System.out.print("Hoelang wordt het geld vastgehouden? (in jaren) ");
		int hold = scanner.nextInt();

		System.out.println("Eindsaldo: " + (initialInvestment * Math.pow((1 + (double) yearlyPercentage / 100), hold)));
	}
}
