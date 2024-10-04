package Week3;

import java.util.Scanner;

public class Wachtwoorden {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een nieuw wachtwoord: ");
		String password = scanner.next();

		while (!isCorrect(password)) {
			System.out.print("Geef een nieuw wachtwoord: ");
			password = scanner.next();
		}

		System.out.println("Je nieuwe wachtwoord is goedgekeurd.");
	}

	public static boolean isCorrect(String password) {
		if (password.length() < 8) {
			System.out.println("Het moet minstens 8 karakters lang zijn");
			return false;
		}

		boolean hasDigit = false;
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean hasSpecialCharacter = false;
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				hasDigit = true;
				continue;
			}

			if (Character.isUpperCase(c)) {
				hasUppercase = true;
				continue;
			}

			if (Character.isLowerCase(c)) {
				hasLowercase = true;
				continue;
			}

			if (!Character.isAlphabetic(c)) {
				hasSpecialCharacter = true;
			}
		}

		if (!hasDigit) {
			System.out.println("Het moet minstens 1 cijfer bevatten");
			return false;
		}

		if (!hasUppercase) {
			System.out.println("Het moet minstens 1 hoofdletter bevatten");
			return false;
		}

		if (!hasLowercase) {
			System.out.println("Het moet minstens 1 kleine letter bevatten");
			return false;
		}

		if (!hasSpecialCharacter) {
			System.out.println("Het moet minstens 1 leesteken bevatten");
			return false;
		}

		return true;
	}
}
