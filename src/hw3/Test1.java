package hw3;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
//		• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個整數: ");
		int[] datas = new int [3];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = scanner.nextInt();
					
		}
		if(datas[0] == datas[1] && datas[0] == datas[2] && datas[0] != 0) {
			System.out.println("正三角形");
		}else if((datas[0] == 0 && datas[1] == 0 && datas[2] == 0)||(datas[1] == 0 || 
				datas[2] == 0 || datas[0] == 0)||(datas[0] + datas[1] < datas[2] || 
				datas[1] + datas[2] < datas[0] || datas[0] + datas[2] < datas[1])) {
			System.out.println("不是三角形");
		}else if((datas[0] == datas[2] && datas[0] != datas[1]) ||
				(datas[1] == datas[2] && datas[1] != datas[0]) ||
				(datas[0] == datas[1] && datas[0] != datas[2])) {
			System.out.println("等腰三角形");
		}else if(datas[0] * datas[0] + datas[1] * datas[1] == datas[2] * datas[2] ||
				datas[2] * datas[2] + datas[1] * datas[1] == datas[0] * datas[0] ||
				datas[0] * datas[0] + datas[2] * datas[2] == datas[1] * datas[1]){
			System.out.println("直角三角形"); //進階功能:加入直角三角形的判斷
		}else {
			System.out.println("其他三角形");
		}
		
		
		scanner.close();
	}
}
