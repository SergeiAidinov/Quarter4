package task3.utils;

public class Utils {

	public static double calculateDistanceBetweenTwoPoints(Point pointA, Point pointB) {
		double firstOperand = Math.pow((pointA.getCoordinateX() - pointB.getCoordinateX()), 2);
		double secondOperand = Math.pow((pointA.getCoordinateY() - pointB.getCoordinateY()), 2);
		double distance = Math.sqrt(Math.abs(firstOperand + secondOperand));
		return distance;
	}

	public static double HeronFormula(double edgeAB, double edgeBC, double edgeCA) {
		double semiperimeter = (edgeAB + edgeBC + edgeCA) / 2;
		double square = Math
				.sqrt(semiperimeter * (semiperimeter - edgeAB) * (semiperimeter - edgeBC) * (semiperimeter - edgeCA));

		return square;

	}

}
