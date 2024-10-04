package Week3;

import java.util.Scanner;

public class Konijn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Aantal maanden: ");
		int n = scanner.nextInt();

		System.out.println("Na " + n + " maanden heb je " + aantal(n) + " paar konijnen");
	}

	public static int aantal(int n) {
		int n1 = 1;
		int n2 = 1;

		while (n > 2) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			n--;
		}

		return n2;
	}
}
