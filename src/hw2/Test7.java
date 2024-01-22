package hw2;

public class Test7 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		String[] strings = {"A", "B", "C", "D", "E", "F"};
		for (int i = 0; i < strings.length; i++) {			
			for (int j = 0; j <= i; j++) {
				System.out.print(strings[i]);
			}
			System.out.println();
		}
		
	}
}
