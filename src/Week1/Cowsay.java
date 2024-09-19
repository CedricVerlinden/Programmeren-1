package Week1;

import java.util.Scanner;

public class Cowsay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een zin: ");
		String sentence = scanner.nextLine();

		System.out.println("______________________");
		System.out.println("< " + sentence + " >");

		System.out.println(
				"----------------------\n" +
				"     \\   ^__^\n" +
				"      \\  (oo)\\_______\n" +
				"         (__)\\       )\\/\\\n" +
				"          U ||----w |\n" +
				"            ||      ||\n"
		);
	}


}
