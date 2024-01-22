package hw1;

public class Test5 {
	public static void main(String[] args) {
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		  金加利息共有多少錢 (用複利計算,公式請自行google)
		
		int money = 1500000;
		double rate = 0.02;
		for (int i = 1; i <= 10; i++) {
			money *= (1 + rate);
		}
		System.out.println("本金 = " + money);
	}
}
