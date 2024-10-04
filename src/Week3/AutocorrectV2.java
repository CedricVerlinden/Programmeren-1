package Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AutocorrectV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Geef een woord: ");
		String word = scanner.next();

		autoCorrect(word);
	}

	public static int afstand(String wordOne, String wordTwo) {
		int wordOneTotal = 0, wordTwoTotal = 0;

		for (char c : wordOne.toCharArray()) {
			wordOneTotal += c;
		}

		for (char c : wordTwo.toCharArray()) {
			wordTwoTotal += c;
		}

		return Math.abs(wordOneTotal - wordTwoTotal);
	}

		public static int levenshteinAfstand(String wordOne, String wordTwo) {
		int[][] dp = new int[wordOne.length() + 1][wordTwo.length() + 1];

		for (int i = 0; i <= wordOne.length(); i++) {
			for (int j = 0; j <= wordTwo.length(); j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else {
					dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + (wordOne.charAt(i - 1) == wordTwo.charAt(j - 1) ? 0 : 1));
				}
			}
		}

		return dp[wordOne.length()][wordTwo.length()];
	}



	public static void autoCorrect(String woord) {
		List<String> words = new ArrayList<>(Arrays.asList(
				"bier",
				"appel",
				"peer",
				"auto",
				"fiets",
				"boom",
				"stoel",
				"tafel",
				"lamp",
				"huis",
				"muur"
		));

		int closest = 999;
		int i = -1;
		for (String s : words) {
			int distance = afstand(woord, s);

			if (distance < closest) {
				closest = distance;
				i = words.indexOf(s);
			}
		}

		if (closest == 0) {
			System.out.println("Dit woord heb je juist geschreven.");
			return;
		}

		System.out.println("Bedoelde je \"" + words.get(i) + "\"?");
	}
}
