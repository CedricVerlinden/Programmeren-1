package Week2;

import java.util.Scanner;

public class Schrikkeljaar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een jaartal: ");
		int year = scanner.nextInt();

		boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		System.out.println("Het jaar " + year + " is " + (isLeapYear ? "een" : "geen") + " schrikkeljaar");
	}
}
