package task3;

import java.util.List;

import task3.utils.Point;

public class Task3MainClass {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(List.of(new Point(10, 20), new Point(50, 30), new Point(30, 50)));
		System.out.println("Площадь треугольника: " + triangle.getSquare());

		try {
			Triangle wrongTriangle = new Triangle(
					List.of(new Point(10, 20), new Point(50, 30), new Point(30, 50), new Point(30, 50)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Square square = new Square(List.of(new Point(70, 10), new Point(100, 40)));
		System.out.println("Площадь квадрата: " + square.getSquare());
		System.out.println("Длина диагонали квадрата: " + square.getDiagonalLength());
		System.out.println("Длина стороны квадрата: " + square.edgeOfSquare());

		try {
			Square wrongSquare = new Square(List.of(new Point(70, 10)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Square anotherWrongSquare = new Square(List.of(new Point(70, 10), new Point(100, 80)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Circle circle = new Circle(new Point(30, 30), 15);
		System.out.println("Площадь круга: " + circle.getSquare());
		System.out.println("Длина окружности: " + circle.getCircumference());

	}

}
