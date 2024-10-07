package Week4;

import java.util.Scanner;

public class GetallenFormateren {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		String number = scanner.next();

		StringBuilder result = new StringBuilder();
		for (int i = number.length() - 1, j = 0; i >= 0; i--, j++) {
			if (j == 3) {
				j = 0;
				result.append(" ");
			}

			result.append(number.charAt(i));
		}

		result.reverse();
		System.out.println(result);
	}
}
