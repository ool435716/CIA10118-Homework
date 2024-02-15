package hw8;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\CIA101_Workspace\\CIA10118-Homework\\src\\hw8\\Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		List<Integer> list = new ArrayList<>();
		
		while(list.size() < 10) {
			list.add((int)(Math.random() * 1000) + 1);
		}
		
		for (Integer integer : list) {
			ps.print(integer + "  ");
			
		}
		
		ps.close();
		bos.close();
		fos.close();
	}
}
