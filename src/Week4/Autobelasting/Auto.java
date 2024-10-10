package Week4.Autobelasting;

public class Auto {

	private String merk;
	private String type;
	private int fiscaalVermogen;

	public double berekenVerkeersbelasting() {
		return switch (fiscaalVermogen) {
			case 1, 2, 3, 4 -> 91.68;
			case 5 -> 114.84;
			case 6 -> 165.96;
			case 7 -> 216.84;
			case 8 -> 268.20;
			case 9 -> 319.44;
			case 10 -> 370.08;
			case 11 -> 480.36;
			case 12 -> 590.52;
			case 13 -> 700.44;
			case 14 -> 810.72;
			case 15 -> 920.88;
			case 16 -> 1206.24;
			case 17 -> 1491.84;
			case 18 -> 777.32;
			case 19 -> 2062.20;
			case 20 -> 2347.68;
			default -> 127.92 * fiscaalVermogen;
		};
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFiscaalVermogen() {
		return fiscaalVermogen;
	}

	public void setFiscaalVermogen(int fiscaalVermogen) {
		this.fiscaalVermogen = fiscaalVermogen;
	}
}
