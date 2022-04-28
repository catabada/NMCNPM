package shape;

public class Circle  implements IShape {
	double banKinh;
	


	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return banKinh*2*Math.PI ;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(banKinh, 2);
	}

	public Circle(double banKinh) {
		super();
		this.banKinh = banKinh;
	}
	

}
