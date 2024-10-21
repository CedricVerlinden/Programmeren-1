package Week5.Tekenprogramma;

public class Circle {

	private final double radius;
	private final Colour colour;

	public Circle(double radius, Colour colour) {
		this.radius = radius;
		this.colour = colour;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public Colour getColour() {
		return colour;
	}

	@Override
	public String toString() {
		return "Cirkel met straal " + radius + " in kleur " + colour.name();
	}
}
