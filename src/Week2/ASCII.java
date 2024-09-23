package Week2;

public class ASCII {

	public static void main(String[] args) {
		printASCII(32, 256);
	}

	public static void printASCII(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("(%3d) %-2c   ", i, (char) i);

			if ((i - start + 1) % 6 == 0) {
				System.out.println();
			}
		}
	}
}
