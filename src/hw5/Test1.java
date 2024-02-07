package hw5;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//		圖:
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入寬與高: ");
		Test1 test1 = new Test1();
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		test1.starSquare(width, height);
		scanner.close();
	}
	
	public void starSquare(int width, int height) {
		if(width > 0 && height > 0) {
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println("寬與高有誤");
		}
		
	}
}
