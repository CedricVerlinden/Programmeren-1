package Week4;

public class VanRechtsNaarLinks {

	public static void main(String[] args) {
		String arabicText = "مرحبا بك في عالم البرمجة";
		String englishText = "Learning Java with Arabic text.";

		System.out.println(arabicText + englishText);

		System.out.println(arabicText.replace("مرحبا بك", ""));

		System.out.println("Length Arabic: " + arabicText.length());
		System.out.println("Length English: " + englishText.length());

		System.out.print("Arabic character per character: ");
		for (char c : arabicText.toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();

		System.out.print("English character per character: ");
		for (char c : englishText.toCharArray()) {
			System.out.print(c + " ");
		}
	}
}
