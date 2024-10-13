package Week5.Tekenprogramma;

import static Week5.Tekenprogramma.Colour.*;

public class Tekenprogramma {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(3.5, 6, CYAN);
		Rectangle rectangle2 = new Rectangle(3.1, 7.3, MAGENTA);
		Circle circle1 = new Circle(5, YELLOW);
		Circle circle2 = new Circle(2, MAGENTA);

		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println(circle1);
		System.out.println(circle2);

		double totalArea = rectangle1.area() + rectangle2.area() + circle1.area() + circle2.area();
		double cyanArea = rectangle1.area();
		double magentaArea = rectangle2.area() + circle2.area();
		double yellowArea = circle1.area();

		System.out.println();
		System.out.printf("Totale oppervlakte is: %f%n", totalArea);
		System.out.printf("Totale oppervlakte cyaan is: %f%n", cyanArea);
		System.out.printf("Totale oppervlakte magenta is: %f%n", magentaArea);
		System.out.printf("Totale oppervlakte geel is: %f%n", yellowArea);
	}
}
