package hwEx;

public class InkBrush extends Pen{
	
	@Override
	public double getPrice() {
		
		return super.getPrice() * 0.9;
	}
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
		
	}

}
