package Week4.VaatjesBier;

public class VaatjesBier {

	public static void main(String[] args) {
		BierVat vat = new BierVat();
		vat.setCapaciteit(15);
		vat.vulVolledig();
		System.out.println("Percentage = " + vat.percentageGevuld());
		System.out.println("Het vat is" + (vat.isVol() ? "" : " niet") + " vol");
		vat.tap(3.75);
		System.out.println("Percentage = " + vat.percentageGevuld());
		System.out.println("Het vat is" + (vat.isVol() ? "" : " niet") + " vol");
	}
}
