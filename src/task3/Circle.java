package task3;

import task3.utils.Point;

public class Circle extends Figure implements Circumference {

	private Point center;
	private int radius;

	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	@Override
	public double getSquare() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

}
