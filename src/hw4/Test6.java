package hw4;


public class Test6 {
	public static void main(String[] args) {
//		• 班上有8位同學,他們進行了6次考試結果如下:
//       1號   2號   3號   4號   5號   6號   7號   8號 
//	1考	 10    25   40    100   90   85    75   70
//	2考	 37    75   77    89    64   75    70   95
//	3考	 100   70   79    90    75   70    79   90
//	4考	 77    95   70    89    60   75    85   89
//	5考	 98    70   89    90    75   90    89   90
//	6考	 90    80   100   75    50   20    99   75
//			請算出每位同學考最高分的次數
//			(提示:二維陣列)
		int[][] scores = {{10, 25, 40, 100, 90, 85, 75, 70}, {37, 75, 77, 89, 64, 75, 70, 95}, {100, 70, 79,
						   90, 75, 70, 79, 90}, {77, 95, 70, 89, 60, 75, 85, 89}, {98, 70, 89, 90, 75, 90,
						   89, 90}, {90, 80, 100, 75, 50, 20, 99, 75}};
		
		int[] students = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[] max = new int [6];
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if(max[i] < scores[i][j]) {
					max[i] = scores[i][j];
				}
				
			}
		}
		
		int[] arr = new int [6];
		for (int i = 0; i < scores.length; i++) {
			int count = 0;
			for (int j = 0; j < scores[i].length; j++) {
				
				if(max[i] == scores[i][j]) {
					break;
				}else {
					count++;
				}
				arr[i] = count;
			}
		}
		
		int[] arr1 = new int[students.length];
		
		for (int i = 0; i < students.length ; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(students[i] == arr[j] + 1) {
					count++;
					arr1[i] = count;
				}
				
			}
			System.out.println(students[i] + "號 " + arr1[i] + "次");
		}
	}	
}
