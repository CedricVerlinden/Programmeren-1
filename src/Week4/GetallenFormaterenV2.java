package Week4;

import java.util.Scanner;

public class GetallenFormaterenV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een getal: ");
		String number = scanner.next();

		String[] parts = number.split("\\.");
		String afterComma = parts[0];
		String beforeComma = parts.length > 1 ? "." + parts[1] : "";

		StringBuilder result = new StringBuilder();
		for (int i = afterComma.length() - 1, j = 0; i >= 0; i--, j++) {
			if (j == 3) {
				j = 0;
				result.append(" ");
			}

			result.append(number.charAt(i));
		}

		result.reverse();
		result.append(beforeComma);

		System.out.println(result);
	}
}
