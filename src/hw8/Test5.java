package hw8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test5 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\data\\Object.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		try {
			while(true) {
				((Animal) ois.readObject()).speak();
			}
		}catch (EOFException e) {
				System.out.println("end");			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ois.close();
		fis.close();
		
		
	}
}
