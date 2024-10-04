package Week3;

public class Dobbelsteen {

	public static void main(String[] args) {

		int enen = 0, tweeen = 0, drieen = 0, vieren = 0, vijven = 0, zessen = 0;

		for (int i = 0; i < 6000; i++) {
			switch (rolDobbelsteen()) {
				case 1 -> enen++;
				case 2 -> tweeen++;
				case 3 -> drieen++;
				case 4 -> vieren++;
				case 5 -> vijven++;
				case 6 -> zessen++;
			}
		}

		System.out.println("Aantal enen: " + enen);
		System.out.println("Aantal tweeën: " + tweeen);
		System.out.println("Aantal drieën: " + drieen);
		System.out.println("Aantal vieren: " + vieren);
		System.out.println("Aantal vijven: " + vijven);
		System.out.println("Aantal zessen: " + zessen);
	}

	public static int rolDobbelsteen() {
		return (int) (Math.random()*6+1);
	}
}
