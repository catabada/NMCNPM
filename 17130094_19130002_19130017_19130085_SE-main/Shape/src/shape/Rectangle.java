package shape;

public class Rectangle implements IShape {
	double chieuDai;
	double chieuRong;
	@Override
	public double chuVi() {
		
		return (chieuDai+chieuRong)*2;
	}
	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}
	public Rectangle(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

}
