package hw4;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		int[] total = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入年: ");
		int year = scanner.nextInt();
		System.out.println("輸入月: ");
		int month = scanner.nextInt();
		System.out.println("輸入日: ");
		int day = scanner.nextInt();
		int sum = 0;

		if (year % 4 == 0 || year % 400 == 0) {
			total[1] = 29;
			if ((year > 2024 || year <= 0) || (month > 12 || month <= 0) || (day > total[month - 1] || day < 0)) {
				System.out.println("超出範圍");
			} else {
				for (int i = 0; i < total.length; i++) {
					if (month == i + 1) {
						break;
					} else {
						sum += total[i];
					}
				}
				System.out.println("輸入的日期為該年的第" + (sum + day) + "天");
			}

		} else {
			if ((year > 2024 || year <= 0) || (month > 12 || month <= 0) || (day > total[month - 1] || day < 0)) {
				System.out.println("超出範圍");
			} else {
				if (day == total[1] + 1) {
					System.out.println("超出範圍");
				} else {
					for (int i = 0; i < total.length; i++) {
						if (month == i + 1) {
							break;
						} else {
							sum += total[i];
						}
					}
					System.out.println("輸入的日期為該年的第" + (sum + day) + "天");
				}
			}

		}

		scanner.close();
	}
}
