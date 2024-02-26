package hw10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean b = true;
		while(b) {
			try {
				System.out.println("請輸入數字: ");
				BigDecimal i = scanner.nextBigDecimal();
				System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
				int s = scanner.nextInt();
				switch (s) {
					case 1: {
						Format f1 = new DecimalFormat("#,###");
						System.out.println(f1.format(i));
						break;
					}
					case 2: {
						NumberFormat f2 = NumberFormat.getPercentInstance();
						System.out.println(f2.format(i));
						break;
					}
					case 3: {
						Format f3 = new DecimalFormat("0.##E00");
						System.out.println(f3.format(i));
						break;
					}
				}
				b = false;
			} catch (InputMismatchException e) {
				System.out.println("數字格式不正確，請再輸入一次!");
				scanner.nextLine();
			}
		}
		
		scanner.close();
		
			
		
		
		
	}
}
