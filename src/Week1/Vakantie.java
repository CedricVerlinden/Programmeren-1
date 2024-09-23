package Week1;

import java.util.Scanner;

public class Vakantie {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hoeveel heeft Jürn uitgegeven? ");
		double p1 = scanner.nextDouble();

		System.out.print("Hoeveel heeft Cédric uitgegeven? ");
		double p2 = scanner.nextDouble();

		double total = p1 + p2;
		double perPerson = total / 2;

		System.out.println("In totaal werd er " + total + " EUR uitgegeven.");
		System.out.println("Dat is " + perPerson + " EUR per persoon.");

		boolean doesJurnOwe = p1 < p2;
		System.out.println("Jürn " + (doesJurnOwe ? "moet" : "krijgt") + " " + (doesJurnOwe ? perPerson - p1 : perPerson - p2) + " EUR " + (doesJurnOwe ? "bijbetalen." : "terugkrijgen."));
	}
}