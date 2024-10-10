package Week4.Belastingen;

public class Belastingen {

	public static void main(String[] args) {
		BTW btw = new BTW();
		btw.setPercentage(6);
		double bedrag = btw.voegBtwBij(100);
		System.out.println("Het bedrag met BTW is: " + bedrag);
		bedrag = btw.neemBtwWeg(106);
		System.out.println("Het bedrag zonder BTW is: " + bedrag);
	}
}
