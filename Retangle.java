package Shape;

public class Retangle extends AbstractHelper{
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;

	
	public Retangle(Point p1, Point p2, Point p3, Point p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public Retangle() {
	}

	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	public Point getP4() {
		return p4;
	}
	public void setP4(Point p4) {
		this.p4 = p4;
	}


	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input 1st point of retangle: ");
		p1.input();

		System.out.println("Input 2nd point of retangle: ");
		p2.input();

		System.out.println("Input 3rd point of retangle: ");
		boolean valid;
		do {
			p3.input();
			p4.input();
			valid = isValid();
			if (!valid) {
				System.out.println("Not a triangle. Please try again: ");
			}
		} while (!valid);
		
	}


	@Override
	public String toString() {
		return "Retangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		
	}


	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		double c1 = new LineSegment(p1, p2).calculateLenght();
		double c2 = new LineSegment(p2, p3).calculateLenght();
		double c3 = new LineSegment(p3, p4).calculateLenght();
		double c4 = new LineSegment(p1, p4).calculateLenght();
		double cHuyen = new LineSegment(p1, p3).calculateLenght();
		System.out.printf("c1 = %f\n", c1);
		System.out.printf("c2 = %f\n", c2);
		System.out.printf("c3 = %f\n", c3);
		System.out.printf("c4 = %f\n", c4);
		System.out.printf("canh huyen = %f\n", cHuyen);

		/*
		 * Chung minh hcn:
		 * - Chung minh 2 cap canh bang nhau
		 * - Chung minh tam giac vuong ben trong
		 * - Cong thuc cm tam giac vuong: ABˆ2 + ACˆ2 = BCˆ2
		 */

		return (c1 - c3 <= AbstractHelper.EPSILON // c1 == c2
				&& c2 - c4 <= AbstractHelper.EPSILON
				&& (Math.pow(c1, 2) + Math.pow(c2, 2) - Math.pow(cHuyen, 2)) <= AbstractHelper.EPSILON);
	}
	
	@Override
	public double perimeterCalculate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double areaCalculate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
