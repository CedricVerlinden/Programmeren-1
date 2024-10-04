package Week3;

import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een woord: ");
		String word = scanner.next().toUpperCase();

		StringBuilder morse = new StringBuilder();
		for (char c : word.toCharArray()) {
			switch (c) {
				case 'A' -> morse.append(".-").append(" ");
				case 'B' -> morse.append("-...").append(" ");
				case 'C' -> morse.append("-.-.").append(" ");
				case 'D' -> morse.append("-..").append(" ");
				case 'E' -> morse.append(".").append(" ");
				case 'F' -> morse.append("..-.").append(" ");
				case 'G' -> morse.append("--.").append(" ");
				case 'H' -> morse.append("....").append(" ");
				case 'I' -> morse.append("..").append(" ");
				case 'J' -> morse.append(".---").append(" ");
				case 'K' -> morse.append("-.-").append(" ");
				case 'L' -> morse.append(".-..").append(" ");
				case 'M' -> morse.append("--").append(" ");
				case 'N' -> morse.append("-.").append(" ");
				case 'O' -> morse.append("---").append(" ");
				case 'P' -> morse.append(".--.").append(" ");
				case 'Q' -> morse.append("--.-").append(" ");
				case 'R' -> morse.append(".-.").append(" ");
				case 'S' -> morse.append("...").append(" ");
				case 'T' -> morse.append("-").append(" ");
				case 'U' -> morse.append("..-").append(" ");
				case 'V' -> morse.append("...-").append(" ");
				case 'W' -> morse.append(".--").append(" ");
				case 'X' -> morse.append("-..-").append(" ");
				case 'Y' -> morse.append("-.--").append(" ");
				case 'Z' -> morse.append("--..").append(" ");
			}
		}

		System.out.println("De morsecode is: " + morse);
	}
}
