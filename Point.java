/*
 * Xây dựng lớp Point trên mặt phẳng 2 chiều gồm:
 * Các thuộc tính: hoành độ x, tung độ y.
 * Các phương thức: get, set, constructor, input, output.
 */

package Shape;

import java.util.Scanner;

public class Point {
	private int y;
	private int x;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap toa do x, y: ");
		this.x = sc.nextInt();
		this.y = sc.nextInt();
	}

	public void output() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Point {x = " + x + " y = " + y + "}";
	}
	
}

