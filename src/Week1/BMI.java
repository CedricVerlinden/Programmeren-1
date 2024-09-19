package Week1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Beste patient, dit programma berekent je Week1.BMI.");
		System.out.print("Geef je gewicht in kilogram: ");
		double weight = scanner.nextDouble();

		System.out.print("Geef je lengte in meter: ");
		double height = scanner.nextDouble();

		System.out.println("Je Week1.BMI is: " + (weight / (height * height)));
	}
}