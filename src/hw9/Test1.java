package hw9;


public class Test1 implements Runnable{
	String name;
	int counter = 0;
	

	public Test1() {
		super();
	}


	public Test1(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() { 
		while(counter < 10) {
			counter++;
			System.out.println(name + "吃第" + counter + "碗飯");
			try {
				Thread.sleep((int)(Math.random() * 2500) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println(name + "吃完了!");
	}
	public static void main(String[] args) {
		Test1 test1 = new Test1("饅頭人");
		Thread t1 = new Thread(test1);
		Test1 test2 = new Test1("詹姆士");
		Thread t2 = new Thread(test2);
		System.out.println("-----大胃王快食比賽開始!-----");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!-----");
	}
	
}
