package hw4;

public class Test3 {
	public static void main(String[] args) {
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		char[] s = {'a', 'e', 'i', 'o', 'u'};
		String string = "";
		
		for (int i = 0; i < planet.length; i++) {
			string += planet[i];
		}
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < s.length; j++) {
				if(string.charAt(i) == s[j]) {
					count++;
				}
			}
			
		}
		System.out.println(count);
		
	}
}
