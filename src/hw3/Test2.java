package hw3;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		Scanner scanner = new Scanner(System.in);
		int r = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧!");
		while(true) {
			int x = scanner.nextInt();
			if(r == x) {
				System.out.println("答對了!答案就是" + r);
				break;
			}else if(x > 9 || x < 0){
				System.out.println("輸入錯誤!");
			}else {
				System.out.println("猜錯囉");
			}
			
		}
		scanner.close();
		
//		進階挑戰
//		
//		Scanner scanner = new Scanner(System.in);
//		int r = (int) (Math.random() * 100);
//		System.out.println("開始猜數字吧!");
//		while(true) {
//			int x = scanner.nextInt();
//			if(r == x) {
//				System.out.println("答對了!答案就是" + r);
//				break;
//			}else if(x > 100 || x < 0){
//				System.out.println("輸入錯誤!");
//			}else if(x > r){
//				System.out.println("猜錯囉，目前大於正確答案");
//			}else {
//				System.out.println("猜錯囉，目前小於正確答案");
//			}
//			
//		}
//		scanner.close();
	}
}
