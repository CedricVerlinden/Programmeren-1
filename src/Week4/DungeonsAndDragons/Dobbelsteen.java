package Week4.DungeonsAndDragons;

import java.util.Random;

public class Dobbelsteen {

	Random random = new Random();
	private int aantalZijden = 6;

	public Dobbelsteen() {

	}

	public double gooi() {
		return random.nextInt(0, aantalZijden);
	}

	public void setAantalZijden(int aantalZijden) {
		this.aantalZijden = aantalZijden;
	}
}
