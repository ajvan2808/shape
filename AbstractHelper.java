package Shape;

public abstract class AbstractHelper {
	public static final double EPSILON = 0.0000001;
	
	public abstract void input();
	public abstract void output();
	public abstract boolean isValid();
	public abstract double perimeterCalculate();
	public abstract double areaCalculate ();
}
