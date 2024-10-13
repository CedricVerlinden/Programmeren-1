package Week5.Verhuisfirma;

public class Box {

	private String type;
	private double length;
	private double width;
	private double height;

	public Box(String type, double length, double width, double height) {
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Box(String type) {
		this.type = type;

		switch (type) {
			case "Type1" -> {
				this.length = 100;
				this.width = 50;
				this.height = 50;
			}
			case "Type2" -> {
				this.length = 50;
				this.width = 25;
				this.height = 25;
			}
			case "Type3" -> {
				this.length = 25;
				this.width = 12.5;
				this.height = 12.5;
			}
			default -> {
				System.out.println("De type '" + type + "' bestaat niet!");
				this.length = -1;
				this.width = -1;
				this.height = -1;
			}
		}
	}

	public double groundArea() {
		return length * width;
	}

	public double volume() {
		return length * width * height;
	}

	public double tapeLength() {
		return 2 * (length + height);
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Doos van het type ").append(type);
		string.append("\n    ");
		string.append(length).append(" * ").append(width).append(" * ").append(height);
		string.append("\n    ");
		string.append("oppervlakte: ").append(groundArea());
		string.append("\n    ");
		string.append("volume: ").append(volume());
		string.append("\n    ");
		string.append("tape lengte: ").append(tapeLength());

		return string.toString();
	}
}
