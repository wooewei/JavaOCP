package day02;

public class Top {
	String name; //上衣名字
	int price; //上衣價格
	
	public Top(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public void printInfo() {
		System.out.printf("%s $%d%n",name,price);
	}
}
