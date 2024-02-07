package hw5;

public class Test2 {
	public static void main(String[] args) {
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		Test2 test2 = new Test2();
		test2.randAvg();
	}
	public void randAvg() {
		System.out.println("本次亂數結果: ");
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println(sum / arr.length);
	}
}
