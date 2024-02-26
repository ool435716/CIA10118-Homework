package hwEx;

public class Test {
	public static void main(String[] args) {
		
		
		Pen[] p = new Pen[2];
		
		p[0] = new Pencil();
		p[1] = new InkBrush();
		
		for (int i = 0; i < p.length; i++) {
			p[i].setPrice(10);
			System.out.println(p[i].getPrice());
			p[i].write();
			
		}
	}
	
}
