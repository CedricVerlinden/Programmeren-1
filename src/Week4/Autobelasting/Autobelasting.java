package Week4.Autobelasting;

public class Autobelasting {

	public static void main(String[] args) {
		Auto renault = new Auto();
		Auto porsche = new Auto();
		Auto rollsRoyce = new Auto();

		renault.setMerk("Renault");
		renault.setType("Scénic");
		renault.setFiscaalVermogen(8);

		porsche.setMerk("Porsche");
		porsche.setType("911 GT3");
		porsche.setFiscaalVermogen(19);

		rollsRoyce.setMerk("Rolls-Royce");
		rollsRoyce.setType("Phantom");
		rollsRoyce.setFiscaalVermogen(32);

		System.out.printf("%s %s met %dPK. U betaalt €%.2f%n", renault.getMerk(), renault.getType(), renault.getFiscaalVermogen(), renault.berekenVerkeersbelasting());
		System.out.printf("%s %s met %dPK. U betaalt €%.2f%n", porsche.getMerk(), porsche.getType(), porsche.getFiscaalVermogen(), porsche.berekenVerkeersbelasting());
		System.out.printf("%s %s met %dPK. U betaalt €%.2f%n", rollsRoyce.getMerk(), rollsRoyce.getType(), rollsRoyce.getFiscaalVermogen(), rollsRoyce.berekenVerkeersbelasting());
	}
}
