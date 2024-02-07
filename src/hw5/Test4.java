package hw5;

public class Test4 {
	public static void main(String[] args) {
		Test4 test4 = new Test4();
		System.out.println(test4.getAuthCode());
	}
	
	public char[] getAuthCode() {
		String string = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		char[] s = new char[8];
		
		for (int i = 0; i < s.length; i++) {	
			s[i] = string.charAt((int)(Math.random() * string.length()));
		}
		return s;
	}
}
