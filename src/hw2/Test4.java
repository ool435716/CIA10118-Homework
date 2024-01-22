package hw2;

public class Test4 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		for (int i = 1; i <= 10; i++) {
			if(i * i > 100) {
				break;
			}else 
				System.out.println(i * i);
			
		}
	}
}
