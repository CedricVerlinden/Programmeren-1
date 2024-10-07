package Week4;

import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Statistiek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IntSummaryStatistics total = new IntSummaryStatistics();

		int number = -2;
		while (!(number == -1)) {
			System.out.print("Geef een getal (-1 = stop): ");
			number = scanner.nextInt();
			if (number == -1 ) continue;
			total.accept(number);
		}


		System.out.println("Je gaf " + total.getCount() + " getallen in.");
		System.out.println("Het gemiddelde is " + total.getAverage());
	}
}
