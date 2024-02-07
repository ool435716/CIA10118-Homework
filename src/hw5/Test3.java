package hw5;

public class Test3 {
	public static void main(String[] args) {
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		Test3 test3 = new Test3();
		
		System.out.println(test3.maxElement(intArray));
		System.out.println(test3.maxElement(doubleArray));
	}
	
	public int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if(max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if(max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}
