package hw8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//			Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		File file = new File("C:\\CIA101_Workspace\\CIA10118-Homework\\Sample.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
				

		String ii;
		int count = 0;
		int total = 0;
		while ((ii = br.readLine()) != null) {
			System.out.println(ii);
			total += ii.length();
			count ++;
		}
		
		FileInputStream fr = new FileInputStream(new File("C:\\CIA101_Workspace\\CIA10118-Homework\\Sample.txt"));
		int i;
		byte[] b = new byte[1];
		int sum = 0;
		while((i = fr.read()) != -1) {
			sum += b.length;			
		}
		System.out.println("Sample.txt檔案共有" + sum + "個位元組," + total + "個字元," + count + "列資料");
		fr.close();
		br.close();
	}
}
