package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		try {
			System.out.println("請輸入X的值: ");
			int x = scanner.nextInt();
			System.out.println("請輸入Y的值: ");
			int y = scanner.nextInt();
		
			System.out.println(x + "的" + y + "次方等於" + calculator.powerXY(x, y));
		} catch (CalException e) {
			e.printStackTrace();
		} catch (InputMismatchException e){
			System.out.println("輸入格式不正確");
		} finally {
			scanner.close();
		}
	}
}
