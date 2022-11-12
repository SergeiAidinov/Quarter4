package task3;

import java.util.List;

import task3.utils.Point;
import task3.utils.Utils;

public class Triangle extends Polygon {

	Triangle(List<Point> vertexList) {
		super(vertexList);
		if (vertexList.size() != 3) {
			throw new IllegalArgumentException("У треугольника можеть быть только три вершины");
		}
	}

	@Override
	public double getSquare() {
		double edgeAB = Utils.calculateDistanceBetweenTwoPoints(vertexList.get(0), vertexList.get(1));
		double edgeBC = Utils.calculateDistanceBetweenTwoPoints(vertexList.get(1), vertexList.get(2));
		double edgeCA = Utils.calculateDistanceBetweenTwoPoints(vertexList.get(2), vertexList.get(0));
		double square = Utils.HeronFormula(edgeAB, edgeBC, edgeCA);
		return square;
	}

}
