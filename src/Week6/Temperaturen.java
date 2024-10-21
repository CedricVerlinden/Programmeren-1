package Week6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Temperaturen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double[] temps = new Double[7];

		for (int i = 0; i < 7; i++) {
			System.out.printf("Geef de temperatuur van dag %d: ", (i+1));
			temps[i] = scanner.nextDouble();
		}

		int i = 0;
		double average = 0;
		for (Double temp : temps) {
			System.out.printf("Dag %d: %5.1f°%n", (i+1), temp);
			average += temp;
			i++;
		}

		System.out.printf("Min Temp: %.2f°%n", Collections.min(Arrays.stream(temps).toList()));
		System.out.printf("Max Temp: %.2f°%n", Collections.max(Arrays.stream(temps).toList()));
		System.out.printf("Average Temp: %.2f°%n", (average/temps.length));
	}
}
