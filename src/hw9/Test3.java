package hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Train> list = new ArrayList<>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(list);
		
		for (Train train : list) {
			System.out.println(train);
		}
		
		System.out.println("========================================================================");
		
		Iterator<Train> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("========================================================================");
		
		for (Iterator<Train> iterator2 = list.iterator(); iterator2.hasNext();) {
			System.out.println(iterator2.next());
		}
	}
}
