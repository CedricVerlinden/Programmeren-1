package Week2;

public class ASCII {

	public static void main(String[] args) {
		printASCII(32, 127);
		printASCII(128, 255);
		printASCII(256, 383);
	}

	public static void printASCII(int start, int end) {
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Waarde van " + start + " tot en met " + end);
		for (int i = start; i <= end; i++) {
			System.out.printf("(%3d) %-2c   ", i, (char) i);

			if ((i - start + 1) % 6 == 0) {
				System.out.println();
			}
		}
	}
}
