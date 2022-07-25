/*
 * Các thuộc tính: tọa độ 3 đỉnh.
 * Các phương thức: get, set, constructor, input, output, isValid, perimeterCalculate, areaCalculate.
 */
package Shape;

public class Triangle extends AbstractHelper{
	//  Định nghiã sai số có thể accept khi so sánh double - lấy tới 5 giá trị thập phân thôi
	private Point apexX;
	private Point apexY;
	private Point apexZ;


	public Triangle(Point apexX, Point apexY, Point apexZ) throws Exception {
		this.apexX = apexX;
		this.apexY = apexY;
		this.apexZ = apexZ;
		if (!isValid()) {
			throw new Exception("Cannot form a triangle.");
		}
	}
	public Triangle() throws Exception{
		this.apexX = new Point();
		this.apexY = new Point();
		this.apexZ = new Point();
	}


	public Point getApexX() {
		return apexX;
	}
	public void setApexX(Point apexX) {
		this.apexX = apexX;
	}
	public Point getApexY() {
		return apexY;
	}
	public void setApexY(Point apexY) {
		this.apexY = apexY;
	}
	public Point getApexZ() {
		return apexZ;
	}
	public void setApexZ(Point apexZ) {
		this.apexZ = apexZ;
	}

	@Override
	public void output(){
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return "Triangle [apexX=" + apexX + ", apexY=" + apexY + ", apexZ=" + apexZ + "]";
	}

	@Override
	public void input() {
		System.out.println("Input first apex of triangle: ");
		apexX.input();

		System.out.println("Input second apex of triangle: ");
		apexY.input();

		System.out.println("Input third apex of triangle: ");
		boolean valid;
		do {
			apexZ.input();
			valid = isValid();
			if (!valid) {
				System.out.println("Not a triangle. Please try again: ");
			}
		} while (!valid);
	}

	// Kiểm tra có tạo thành một tam giác
	@Override
	public final boolean isValid() {
		double c1 = new LineSegment(apexX, apexY).calculateLenght();
		double c2 = new LineSegment(apexY, apexZ).calculateLenght();
		double c3 = new LineSegment(apexX, apexZ).calculateLenght();
		System.out.printf("c1 = %f\n", c1);
		System.out.printf("c2 = %f\n", c2);
		System.out.printf("c3 = %f\n", c3);

		// Tam giác luôn có tổng 2 cạnh bất kỳ lớn hơn cạnh còn lại
		return (c2 + c3 - c1 > AbstractHelper.EPSILON 
				&& c3 + c1 - c2 > AbstractHelper.EPSILON 
				&& c1 + c2 - c3 > AbstractHelper.EPSILON);

		/* 0: if d1 is numerically equal to d2.
		Negative value: if d1 is numerically less than d2.
		Positive value: if d1 is numerically greater than d2.

		 * return (Double.compare(c1, (c2 + c3)) < 0 
				&& Double.compare(c2, (c1 + c3)) < 0
				&& Double.compare(c3, (c1 + c2)) < 0   
				&& !(c1 ==0 || c2 ==0 || c3 ==0));
		*/
	}

	// Chu vi tam giac = tong 3 canh
	@Override
	public double perimeterCalculate () {
		return (new LineSegment(apexX, apexY).calculateLenght()
				+ new LineSegment(apexY, apexZ).calculateLenght()
				+ new LineSegment(apexX, apexZ).calculateLenght());
	}

	// The tich tam giac (Heron)
	@Override
	public double areaCalculate () {
		double c1 = new LineSegment(apexX, apexY).calculateLenght();
		double c2 = new LineSegment(apexY, apexZ).calculateLenght();
		double c3 = new LineSegment(apexX, apexZ).calculateLenght();
		double halfP = (c1 + c2 + c3) /2;
		return Math.sqrt(halfP*(halfP-c1) * (halfP-c2) * (halfP-c3));
	}
}
