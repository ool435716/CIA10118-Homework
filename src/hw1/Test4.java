package hw1;

public class Test4 {
	public static void main(String[] args) {
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double r = 5;
		double x = r * r * PI;
		double y = r * 2 * PI;
		System.out.println("圓面積 = " + x);
		System.out.println("圓周長 = " + y);
	}
}
