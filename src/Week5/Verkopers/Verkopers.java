package Week5.Verkopers;

import java.util.Scanner;

public class Verkopers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geef de omzet van de eerste verkoper: ");
		double revenue = scanner.nextDouble();
		SalesPerson viktor = new SalesPerson("Viktor", revenue);

		System.out.print("Geef de omzet van de tweede verkoper: ");
		revenue = scanner.nextDouble();
		SalesPerson tine = new SalesPerson("Tine", revenue);

		System.out.print("Geef de omzet van de derde verkoper: ");
		revenue = scanner.nextDouble();
		SalesPerson kubra = new SalesPerson("Kubra", revenue);

		SalesPerson bestSalesPerson = viktor;
		if (tine.generatesMoreRevenueThan(bestSalesPerson)) {
			bestSalesPerson = tine;
		}

		if (kubra.generatesMoreRevenueThan(bestSalesPerson)) {
			bestSalesPerson = kubra;
		}

		System.out.println("De beste verkoper is " + bestSalesPerson);
	}
}
