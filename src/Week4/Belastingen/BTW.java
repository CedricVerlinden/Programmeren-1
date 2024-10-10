package Week4.Belastingen;

public class BTW {

	private int percentage;

	public double voegBtwBij(double bedrag) {
		return bedrag * (1 + (percentage / 100.0));
	}

	public double neemBtwWeg(double bedrag) {
		return bedrag / (1 + (percentage / 100.0));
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
