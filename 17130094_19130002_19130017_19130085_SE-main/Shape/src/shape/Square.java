package shape;


public class Square implements IShape {
	private double edge;

	@Override
	public double chuVi() {
		return 4 * edge;
	}

	@Override
	public double dienTich() {
		return edge * edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	public Square(double edge) {
		this.edge = edge;
	}

}
