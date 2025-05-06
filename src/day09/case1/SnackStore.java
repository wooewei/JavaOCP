package day09.case1;

// 小吃(台灣第一家鹽酥雞專賣店)
public class SnackStore {

	public static void main(String[] args) {
		SaltedChicken saltedChicken = new SaltedChicken("鹽酥雞", 60);
		Tempura tempura = new Tempura("甜不辣", 30);
		Tofu tofu = new Tofu("百頁豆腐", 25);
		
		//製作鹽酥雞餐點
		System.out.printf("===開始製作%s===\n",saltedChicken.getName());
		saltedChicken.prepare();
		saltedChicken.cook();
		saltedChicken.serve();
		System.out.printf("=== 售價:NT %d===\n",saltedChicken.getPrice());
		System.out.printf("=== 製作完成%s===\n",saltedChicken.getName());
		System.out.println();

		//製作甜不辣餐點
		System.out.printf("=== 開始製作%s===\n",tempura.getName());
		tempura.prepare();
		tempura.cook();
		tempura.serve();
		System.out.printf("=== 售價:NT %d===\n",tempura.getPrice());
		System.out.printf("=== 製作完成%s===\n",tempura.getName());
		System.out.println();
		
		//製作百頁豆腐餐點
		System.out.printf("=== 開始製作%s===\n",tofu.getName());
		tofu.prepare();
		tofu.cook();
		tofu.serve();
		System.out.printf("=== 售價:NT %d===\n",tofu.getPrice());
		System.out.printf("=== 製作完成%s===\n",tofu.getName());
		System.out.println();
		
	}
}
