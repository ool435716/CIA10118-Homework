package hw9;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
		List<Object> list = new ArrayList<>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short)100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===========================================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===========================================");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println("===========================================");
		
		
		List<Number> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(3.14);
		list1.add(21L);
		list1.add((short)100);
		list1.add(5.1);
		list1.add(100);
		list1.add(new BigInteger("1000"));
		
		Iterator<Number> it1 = list1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("===========================================");
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("===========================================");
		
		for (Object object : list1) {
			System.out.println(object);
		}
		
	}
	
}
