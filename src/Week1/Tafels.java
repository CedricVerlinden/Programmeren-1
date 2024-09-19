package Week1;

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Welke tafel wil je krijgen? ");
			int tafel = scanner.nextInt();

			for (int i = 0; i <= 10; i++) {
				int result = i * tafel;
				System.out.println(i +  " x " + tafel + " = " + result);
			}

			System.out.print("Wenst u nog een tafel af te drukken (j/n)? ");
			String choice = scanner.next();

			if (choice.equals("n")) {
				break;
			}
		}
	}
}