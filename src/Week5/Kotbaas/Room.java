package Week5.Kotbaas;

public class Room {

	private final int roomNumber;
	private Student student;
	private double pricePerMonth;

	public Room(int roomNumber, double pricePerMonth) {
		this.roomNumber = roomNumber;
		this.pricePerMonth = pricePerMonth;

		this.student = new Student("leegstaand", "", "", 1);
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setPricePerMonth(double pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public Student getStudent() {
		return student;
	}

	public double getPricePerMonth() {
		return pricePerMonth;
	}

	@Override
	public String toString() {
		return "Kamer " + roomNumber + ": " + student + " (" + pricePerMonth + "€)";
	}
}
