package Week3;

import java.util.Scanner;

public class Sinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef de amplitude: ");
		int amplitude = scanner.nextInt();

		System.out.print("Geef de periode: ");
		int period = scanner.nextInt();

		for (int i = 0; i < period*3; i++) {
			int positie = (int)(Math.sin(i * 2 * Math.PI / period) * amplitude + amplitude);
			System.out.println(" ".repeat(positie) + "*\n");
		}
	}
}
