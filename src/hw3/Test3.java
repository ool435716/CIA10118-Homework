package hw3;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
//		• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int hate = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= 49; i++) {			
			
			if(i / 10 == hate) {
				continue;
			}else if(i % 10 == hate) {
				continue;
			}
			
			System.out.print(i + " ");
			count++;
		}
		System.out.println("總共有" + count + "個數字可選");
		
		scanner.close();
		
		
//		進階挑戰
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		int hate = scanner.nextInt();
//		int[] number = new int[6];
//		
//		for (int i = 0; i < number.length ; i++) {	
//			
//			number[i] = (int)(Math.random() * 49) + 1;
//			
//			for (int j = 0; j < i; j++) {
//				if(number[j] == number[i]) {
//					number[i] = (int)(Math.random() * 50) + 1;
//					j = 0;
//				}
//			}
//			
//			if(number[i] / 10 == hate) {
//				i--;
//				continue;
//			}else if(number[i] % 10 == hate) {
//				i--;
//				continue;
//			}
//			
//			System.out.print(number[i] + " ");
//		}		
//		scanner.close();
		
		
	}
}
