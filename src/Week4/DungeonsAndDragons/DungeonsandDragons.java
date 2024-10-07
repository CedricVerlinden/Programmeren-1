package Week4.DungeonsAndDragons;

import java.util.Scanner;

public class DungeonsandDragons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dobbelsteen dobbelsteen = new Dobbelsteen();

		System.out.print("Hoeveel zijden? ");
		int zijden = scanner.nextInt();
		scanner.nextLine();

		dobbelsteen.setAantalZijden(zijden);

		for (int i = 0; i < 5; i++) {
			System.out.println("Druk op <enter> om een waarde te creëren");
			scanner.nextLine();
			System.out.println(dobbelsteen.gooi());
		}

		System.out.println("Klaar.");
	}
}
