package Week4.VaatjesBier;

public class BierVat {

	private double capaciteit;
	private double inhoud;

	public void vulVolledig() {
		inhoud = capaciteit;
	}

	public boolean isVol() {
		return inhoud == capaciteit;
	}

	public void tap(double liter) {
		if (liter > inhoud) return;
		inhoud -= liter;
	}

	public double percentageGevuld() {
		return (inhoud / capaciteit) * 100D;
	}

	public void setCapaciteit(double capaciteit) {
		this.capaciteit = capaciteit;
	}

	public void setInhoud(double inhoud) {
		this.inhoud = inhoud;
	}

	public double getCapaciteit() {
		return capaciteit;
	}

	public double getInhoud() {
		return inhoud;
	}
}
