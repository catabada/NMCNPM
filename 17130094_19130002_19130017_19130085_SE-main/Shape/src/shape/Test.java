package shape;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		IShape square1 = new Square(5.0);

		System.out.println("Chu vi hinh vuong = " + " " + square1.chuVi());
		System.out.println("Dien Tich hinh vuong = " + " " + square1.dienTich());
		// hinh tron
		IShape roundShape1 = new Circle(3.0);
		System.out.println("Chu vi hinh trong = " + roundShape1.chuVi());
		System.out.println("Dien tich hinh tron = " + roundShape1.dienTich());
		// hinh chu nhat
		IShape rec1 = new Rectangle(3, 2);
		System.out.println("Chu vi hinh chu nhat = " + rec1.chuVi());
		System.out.println("Dien tich hinh chu nhat = " + rec1.dienTich());
	}
}
