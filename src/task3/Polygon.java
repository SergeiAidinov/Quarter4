package task3;

import java.util.List;

import task3.utils.Point;

public abstract class Polygon extends Figure {

	protected final List<Point> vertexList;

	protected Polygon(List<Point> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Point> getVertexList() {
		return vertexList;
	}

}
