package hw10;

public class Test1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int random = (int)(Math.random() * 100) + 1;
			if(random == 1) {
				System.out.println(random + "不是質數");
				continue;
			}else if(random == 2){
				System.out.println(random + "是質數");
			}else {
				for (int j = 2; j < random; j++) {
					if(random % j == 0) {
						System.out.println(random + "不是質數");
						break;
						
					}else if(j == random - 1){
						System.out.println(random + "是質數");
					}
					
				}
			}
				
			
			
			
		}
	}
}
