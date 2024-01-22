package hw1;

public class Test2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int x = egg % 12;
		int y = egg / 12;
		System.out.println("200顆蛋是" + y + "打" + x + "顆");
	}
}
