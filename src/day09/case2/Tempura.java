package day09.case2;

public class Tempura extends AbstractSnack{

	public Tempura(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepare() {
		System.out.println("將圓形甜不辣切條，祖傳蜜醬汁");
		
	}

	@Override
	public void cook() {
		System.out.println("炸到蓬鬆之後加入蜜醬汁");
		
	}

}
