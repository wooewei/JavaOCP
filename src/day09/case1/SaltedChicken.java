package day09.case1;

//鹽酥雞
public class SaltedChicken implements Snack{
	private String name;
	private int price;
	
	
	public SaltedChicken(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	//---------------------------------------------------------(以下為規格)
	
	@Override
	public void prepare() {
		System.out.println("準備去骨雞腿肉，蒜頭，九層塔，洋蔥");
		
	}

	@Override
	public void cook() {
		System.out.println("雞腿肉炸酥後再加入蒜頭，九層塔，洋蔥翻炒");
		
	}

	@Override
	public void serve() {
		System.out.printf("將%s 灑上胡椒粉後裝入紙袋\n",name);
	}
}
