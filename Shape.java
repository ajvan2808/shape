package Shape;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Shape {
	public static void main(String[] args) throws Exception {
		Point p1 = new Point(0, 5);
		// p1.input();
		// p1.output();

		Point p2 = new Point(0, 2);

		// LineSegment lSegment = new LineSegment(p1, p2);
		// lSegment.output();
		// System.out.println("Line lenght: " + lSegment.calculateLenght());

		Point p3 = new Point(4, 2);
		// Triangle t1 = null;
		// try {
		// 	t1 = new Triangle(p1, p2, p3);
		// } catch (Exception e) {
		// 	Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, e);
		// }
		// if(t1 != null) {
		// 	t1.output();
		// 	double l1 = new LineSegment(p1, p2).calculateLenght();
		// 	double l2 = new LineSegment(p2, p3).calculateLenght();
		// 	double l3 = new LineSegment(p1, p3).calculateLenght();
		// 	System.out.printf("l1 = %.2f, l2 = %.2f, l3 = %.2f", l1, l2, l3);
		// 	System.out.println("Is triangle: " + t1.isValid());
		// }

		// Triangle t2 = new Triangle();
		// t2.input();
		// t2.output();
		// System.out.printf("Chu vi tam giac la: %.2f", t2.perimeterCalculate());
		// System.out.printf("\nDien tich tam giac la: %.2f", t2.areaCalculate());
		
		Point p4 = new Point(4, 0);
		AbstractHelper hcn = new Retangle(p1, p2, p3, p4);
		System.out.println("is valid " + hcn.isValid());
		
	}
}
