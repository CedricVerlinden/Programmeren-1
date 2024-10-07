package Week4;

import java.util.Scanner;

public class Koortsmeetsysteemstrook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een woord: ");
		String word = scanner.next();

		StringBuilder reversed = new StringBuilder(word).reverse();
		System.out.println(word + " is " + (word.equalsIgnoreCase(reversed.toString()) ? "een" : "geen") + " palindroom");
	}
}
