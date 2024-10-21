package Week5.Tekenprogramma;

public class Rectangle {

	private final double width;
	private final double height;
	private final Colour colour;

	public Rectangle(double width, double height, Colour colour) {
		this.width = width;
		this.height = height;
		this.colour = colour;
	}

	public double area() {
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Colour getColour() {
		return colour;
	}

	@Override
	public String toString() {
		return "Rechthoek " + height + " x " + width + " in kleur " + colour.name();
	}
}
