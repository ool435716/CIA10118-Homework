package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle() {
		super();
	}
	public MyRectangle(double width, double depth) {
		super();
		this.width = width;
		this.depth = depth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public void getArea() {
		System.out.println(width * depth);
	}
	
}
