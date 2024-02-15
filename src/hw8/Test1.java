package hw8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//			Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		
		File file = new File("C:\\CIA101_Workspace\\CIA10118-Homework\\src\\hw8\\Sample.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
				

		String s;
		int count = 0;
		int total = 0;
		int sum = 0;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
			total += s.length();
			count ++;
			sum += s.getBytes().length;
		}
		System.out.println("\nSample.txt檔案共有" + sum + "個位元組," + total + "個字元," + count + "列資料");
		
		br.close();
	}
}
