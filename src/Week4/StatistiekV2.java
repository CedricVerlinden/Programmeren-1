package Week4;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class StatistiekV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DoubleSummaryStatistics total = new DoubleSummaryStatistics();

		double number = -2D;
		while (!(number == -1)) {
			System.out.print("Geef een getal (-1 = stop): ");
			number = scanner.nextDouble();
			if (number == -1 ) continue;
			total.accept(number);
		}


		System.out.println("Je gaf " + total.getCount() + " getallen in.");
		System.out.println("Het gemiddelde is " + total.getAverage());
	}
}
