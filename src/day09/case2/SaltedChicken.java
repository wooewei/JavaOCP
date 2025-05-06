package day09.case2;

// 鹽酥雞
public class SaltedChicken extends AbstractSnack{

	public SaltedChicken(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void prepare() {
		System.out.println("準備去骨雞腿肉，蒜頭，九層塔，洋蔥");
		
	}

	@Override
	public void cook() {
		System.out.println("雞腿肉炸酥後再加入蒜頭，九層塔，洋蔥翻炒");
		
	}

}
