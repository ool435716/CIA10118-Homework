package hw3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
//		• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		int hate = scanner.nextInt();
//		
//		int count = 0;
//		if(hate < 1 || hate > 9) {
//			System.out.println("超出可選範圍");
//		}else {
//			for (int i = 1; i <= 49; i++) {			
//			
//			 if(i / 10 == hate) {
//				continue;
//			}else if(i % 10 == hate) {
//				continue;
//			}
//			
//			
//			System.out.print(i + " ");
//			count++;
//			}
//			System.out.println("總共有" + count + "個數字可選");
//		}
//		scanner.close();
		
		
//		進階挑戰
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int hate = scanner.nextInt();
		
		
		if(hate < 1 || hate > 9) {
			System.out.println("超出可選範圍");
		}else{
			Set<Integer> set = new HashSet<>();
			while(set.size() < 6) {
				int number = (int)(Math.random() * 49) + 1;
				if(number / 10 == hate) {
					continue;
				}else if(number % 10 == hate) {
					continue;
				}else {
					set.add(number);
				}
			}
			
			for (Integer integer : set) {
				System.out.println(integer);
			}
			
		}
		scanner.close();
		
		
	}
}
