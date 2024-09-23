package Week2;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een string in: ");
		String string = scanner.nextLine();

		System.out.println(string);

		for (char c : string.toCharArray()) {
			System.out.println(c + " heeft een codepoint gelijk aan " + (int) c);
		}
	}
}
