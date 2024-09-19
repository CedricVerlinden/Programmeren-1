package Week1;

import java.util.Scanner;

public class BMIV2 {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Beste patient, dit programma berekent je Week1.BMI.");
		System.out.print("Geef je gewicht in kilogram: ");
		double weight = scanner.nextDouble();

		System.out.print("Geef je lengte in meter: ");
		double height = scanner.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("Je Week1.BMI is: " + bmi);

		if (bmi < 18) {
			System.out.println("Je hebt ondergewicht.");
		} else if (bmi < 25) {
			System.out.println("Je hebt een normaal gewicht.");
		} else if (bmi < 30) {
			System.out.println("Je hebt overgewicht.");
		} else {
			System.out.println("Je hebt obesitas.");
		}
	}
}