package hw4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		員工編號:  25    32   8    19    27
//		身上現金: 2500  800  500  1000  1200
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//
//		(提示:Scanner,二維陣列)
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入要借的錢: ");
		int[][] arr = {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
		int money = scanner.nextInt();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		int sum = 0;
		if(money > max || money <= 0) {
			System.out.println("沒錢");
		}else {
			System.out.println("有錢可借的員工編號: ");
			for (int i = 0; i < arr.length; i++) {
				if(money <= arr[i][1] && money > 0) {
					System.out.print(arr[i][0] + " ");
					sum++;
					continue;
				}
			}
			System.out.println();
			System.out.println("共" + sum + "人");
		}
		
		scanner.close();
	}
}
