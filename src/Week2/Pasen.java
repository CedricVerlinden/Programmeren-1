package Week2;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Pasen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een jaartal: ");
		int year = scanner.nextInt();

		while (year < 1583) {
			System.out.println("Het jaarmoet moet groter of gelijk zijn aan 1583!");
			System.out.print("Geef een jaartal: ");
			year = scanner.nextInt();
		}

		int n = year % 19;
		int c = year / 100;
		int u = year % 100;
		int s = c / 4;
		int t = c % 4;
		int p = (c + 8) / 25;
		int q = (c - p + 1) / 3;
		int e = (19 * n + c - s - q + 15) % 30;
		int b = u / 4;
		int d = u % 4;
		int L = (2 * t + 2 * b - e - d + 32) % 7;
		int h = (n + 11 * e + 22 * L) / 451;
		int maand = (e + L -7 * h + 114) / 31;
		int dag = ((e + L -7 * h + 114) % 31) + 1;

		System.out.println("In " + year + " valt Pasen op " + dag + " " + Month.of(maand).getDisplayName(TextStyle.FULL, Locale.forLanguageTag("nl")));
	}
}
