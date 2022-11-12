package task3;

import java.util.List;

import task3.utils.Point;
import task3.utils.Utils;

public class Square extends Polygon implements hasDiagonal {

	public Square(List<Point> vertexList) {
		super(vertexList);
		if (vertexList.size() != 2) {
			throw new IllegalArgumentException("Квадрат задается двумя точками, расположенными по диагонали");
		}
		Point pointB = new Point(vertexList.get(0).getCoordinateX(), vertexList.get(1).getCoordinateY());
		double edgeAB = Utils.calculateDistanceBetweenTwoPoints(vertexList.get(0), pointB);
		double edgeBC = Utils.calculateDistanceBetweenTwoPoints(pointB, vertexList.get(1));

		if (edgeAB != edgeBC) {
			throw new IllegalArgumentException("Стороны квадрата должны быть равными");
		}

	}

	@Override
	public double getSquare() {
		Point pointB = new Point(vertexList.get(0).getCoordinateX(), vertexList.get(1).getCoordinateY());
		double edgeAB = Utils.calculateDistanceBetweenTwoPoints(vertexList.get(0), pointB);
		return Math.pow(edgeAB, 2);
	}

	@Override
	public double getDiagonalLength() {
		return Utils.calculateDistanceBetweenTwoPoints(vertexList.get(0), vertexList.get(1));
	}

	public double edgeOfSquare() {
		Point pointB = new Point(vertexList.get(0).getCoordinateX(), vertexList.get(1).getCoordinateY());
		return Utils.calculateDistanceBetweenTwoPoints(vertexList.get(0), pointB);
	}

}
