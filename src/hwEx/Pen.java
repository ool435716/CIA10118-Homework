package hwEx;

public abstract class Pen {
	private String brand;
	private double price;
	
	public Pen() {
		super();
	}
	public Pen(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void write();
	
}
