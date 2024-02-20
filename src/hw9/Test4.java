package hw9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		
		Set<Train> set = new TreeSet<>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		for (Train train : set) {
			System.out.println(train);
		}
		
		System.out.println("========================================================================");
		
		Iterator<Train> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("========================================================================");
		
		for (Iterator<Train> iterator2 = set.iterator(); iterator2.hasNext();) {
			System.out.println(iterator2.next());
		}
	}
}
