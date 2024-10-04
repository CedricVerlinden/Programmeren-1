package Week3;

import java.util.Calendar;

public class DagVanDeWeek {

	public static void main(String[] args) {
		int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

		System.out.print("Vandaag is het ");
		switch (dayOfWeek) {
			case 1 -> System.out.print("zondag");
			case 2 -> System.out.print("maandag");
			case 3 -> System.out.print("dinsdag");
			case 4 -> System.out.print("woensdag");
			case 5 -> System.out.print("donderdag");
			case 6 -> System.out.print("vrijdag");
			case 7 -> System.out.print("zaterdag");
		}
	}
}
