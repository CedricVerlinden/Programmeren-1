package Week5.Kotbaas;

public class Kotbaas {

	public static void main(String[] args) {
		Room room1 = new Room(1, 347.0);
		Room room2 = new Room(2, 431.0);
		Room room3 = new Room(3, 285.0);
		Room room4 = new Room(4, 354.0);

		room2.setStudent(new Student("Halfhide Aleksey", "Stationstraat 42", "Gent", 9000));
		room3.setStudent(new Student("Mutambay Lotte", "Boomforeeststraat 12", "Antwerpen", 2000));
		room4.setStudent(new Student("Domen Tim", "Zonnebloemstraat 7" , "Brussel", 1000));
		System.out.println(room1);
		System.out.println(room2);
		System.out.println(room3);
		System.out.println(room4);
	}
}
