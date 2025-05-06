package day02;

public class McDonalds {
	
	public static void main(String[] args) {
		//單點
		FastFood m1 = new FastFood("主餐", "麥香魚", 45);
		FastFood m2 = new FastFood("主餐", "大麥克", 78);
		FastFood s1 = new FastFood("副餐", "中薯", 55);
		FastFood s2 = new FastFood("副餐", "沙拉", 45);
		FastFood d1 = new FastFood("飲品", "熱咖啡", 48);
		FastFood d2 = new FastFood("飲品", "雪碧", 40);
		//套餐
		FastFood[] no1 = {m2, s1, d1}; //一號餐
		FastFood[] no2 = {m1, s2, d2}; //二號餐
		
		//單點菜單
		System.out.println("==單點==============");
		FastFood[] fastFoods = {m1 ,m2 ,s1 ,s2 ,d1 , d2};
		for(int i=0;i<fastFoods.length;i++) {
			fastFoods[i].printInfo();
		}
		//套餐菜單
		System.out.println("==套餐==============");
		System.out.println("一號餐");
		int total1 = 0;
		for(int i=0;i<no1.length;i++) {
			no1[i].printInfo();
			total1+= no1[i].price;
		}
		System.out.printf("總價 $%d%n",total1);
		System.out.println("------------------");
		System.out.println("二號餐");
		int total2 = 0;
		for(int i=0;i<no1.length;i++) {
			no2[i].printInfo();
			total2+= no1[i].price;
		}
		System.out.printf("總價 $%d%n",total2);
		System.out.println("------------------");
	}
}
