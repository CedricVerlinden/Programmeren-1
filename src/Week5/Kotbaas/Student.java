package Week5.Kotbaas;

public class Student {

	private String name;
	private String streetNr;
	private String city;
	private int postalCode;

	public Student(String name, String streetNr, String city, int postalCode) {
		this.name = name;
		this.streetNr = streetNr;
		this.city = city;
		this.postalCode = postalCode;
	}

	public String getName() {
		return name;
	}

	public String getStreetNr() {
		return streetNr;
	}

	public String getCity() {
		return city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	@Override
	public String toString() {
		if (name.equals("leegstaand")) return name;

		return name + ", " + streetNr + ", " + postalCode + " " + city;
	}
}
