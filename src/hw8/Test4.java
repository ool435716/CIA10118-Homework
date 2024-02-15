package hw8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Test4 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\data");
		file.mkdir();
		
		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Cat cat1 = new Cat("123");
		Cat cat2 = new Cat("321");
		Dog dog1 = new Dog("456");
		Dog dog2 = new Dog("654");
		
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		
		
		oos.close();
		fos.close();
		
		
		
	}
}
