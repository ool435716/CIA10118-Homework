package hw8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
	public void copyFile(String s1, String s2) throws IOException {
		File inputFile = new File(s1); 
		File outputFile = new File(s2);
		
		FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fos = new FileOutputStream(outputFile);
		
		int i;
		while((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		Test3 test3 = new Test3();
		test3.copyFile("C:\\CIA101_Workspace\\CIA10118-Homework\\src\\hw8\\hello.txt", 
				"C:\\CIA101_Workspace\\CIA10118-Homework\\src\\hw8\\hello1.txt");
		
	}
}
