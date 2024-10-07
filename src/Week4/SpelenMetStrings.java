package Week4;

import java.util.Scanner;

public class SpelenMetStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een zin in: ");
		String sentence = scanner.nextLine();

		System.out.println("Er zijn " + sentence.length() + " tekens in deze zin.");
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println("Het eerste character is '" + sentence.charAt(0) + "'");
		System.out.println("Het laatste character is '" + sentence.charAt(sentence.length() - 1) + "'");
		System.out.println("Er zijn " + sentence.replaceAll(" ", "").length() + " karakters als je de spaties niet meetelt.");
		System.out.println(sentence.replaceAll("e", "_"));
		System.out.println(sentence.replaceAll(" ", ""));
		System.out.println(sentence.replaceAll("[aeiouAEIOU]", ""));

	}
}
