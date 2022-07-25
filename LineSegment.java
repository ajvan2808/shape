/*
 * Các thuộc tính: tọa độ 2 điểm.
 * Các phương thức: get, set, constructor, input, output, length
 */

package Shape;

public class LineSegment {
	private Point p1;
	private Point p2;

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
	
	
	public LineSegment(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public LineSegment() {
		this.p1 = new Point();
		this.p2 = new Point();
	}


	public void input() {
		System.out.println("Nhap toa do p1!");
		p1.input();
		System.out.println("Nhap toa do p2!");
		p2.input();
			
	}

	public void output() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "LineSegment [p1=" + p1 + ", p2=" + p2 + "]";
	}

	// tính độ dài vector
	public double calculateLenght(){
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) 
						+ Math.pow(p2.getY() - p1.getY(), 2));
	}

	// kiem tra hinh chu nhat
	
}
