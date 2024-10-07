package Week4;

import java.util.Scanner;

public class KoortsmeetsysteemstrookV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een woord: ");
		String word = scanner.next();

		System.out.println(word + " is " + (isPalindroom(word) ? "een" : "geen") + " palindroom");
	}

	public static boolean isPalindroom(String s) {
		StringBuilder reversed = new StringBuilder(s).reverse();
		return s.equalsIgnoreCase(reversed.toString());
	}
}
