package day10;

public class CareProduct implements Product {
 
	protected String name;
	protected int price;
	 
	public CareProduct(String  name, int price) {
		this.name = name;
		this.price = price;
	}
	 
	public String getName() {
		return name;
	}
	 
	public int getPrice() {
		return price;
	}
	 
}
 