package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle myRectangle = new MyRectangle();
		
		myRectangle.setDepth(10);
		myRectangle.setWidth(20);
		
		myRectangle.getArea();
		
		MyRectangle myRectangle2 = new MyRectangle(10, 20);
		
		myRectangle2.getArea();
	}
}
