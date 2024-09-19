package Week1;

import java.util.Scanner;

public class Kassa {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Aantal kinderen <1m: ");
		scanner.nextInt();

		System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
		int kids = scanner.nextInt();

		System.out.print("Aantal volwassenen: ");
		int adults = scanner.nextInt();

		System.out.print("Aantal senioren (55+): ");
		int seniors = scanner.nextInt();

		System.out.println(
				"*******************************\n" +
				"* Welkom in het pretpark! *\n" +
				"*******************************"
		);

		int totalPeople = kids + adults + seniors;
		double seniorPrice = 0, groupPrice = 0;
		double discount = 0;
		if (seniors >= 2) {
			discount = calculateSeniorsDiscount(kids);
			seniorPrice = calculatePrice(kids, adults, seniors) - discount;
		}

		if (totalPeople >= 10) {
			double lDiscount = calculateGroupDiscount(kids, adults, seniors);
			groupPrice = calculatePrice(kids, adults, seniors) - calculateGroupDiscount(kids, adults, seniors);

			if (groupPrice < seniorPrice) {
				discount = lDiscount;
			}
		}

		boolean isGroupPrice = seniorPrice < groupPrice;

		double effectiveTotal = (seniorPrice == 0 && groupPrice == 0) ? calculatePrice(kids, adults, seniors) : (isGroupPrice ? groupPrice : seniorPrice);

		System.out.println("* Prijs: " + calculatePrice(kids, adults, seniors));
		System.out.println("* " + (isGroupPrice ? "Groepskorting" : "Grootouderkorting") + ": -" + discount + " EUR");
		System.out.println("* Totaal: " + effectiveTotal + " EUR");
		System.out.println("**************************************");
	}

	public static double calculatePrice(int kids, int adults, int seniors) {
		return (kids * 26) + (adults * 31) + (seniors * 15.50);
	}

	public static double calculateGroupDiscount(int kids, int adults, int seniors) {
		double total = calculatePrice(kids, adults, seniors);
		return 0.10 * total;
	}

	public static double calculateSeniorsDiscount(int kids) {
		return (double) (kids * 26) / 2;
	}
}