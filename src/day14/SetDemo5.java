package day14;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo5 {

	public static void main(String[] args) {
		Set<Gift> gifts = new LinkedHashSet<>();
		gifts.add(new Gift("康乃馨","心意",1200,"媽媽你是我的避風港"));
		gifts.add(new Gift("按摩椅","健康",26800,"媽媽的健康無價"));
		gifts.add(new Gift("資生堂抗老精華","美妝",3200,"媽媽永遠年輕"));
		gifts.add(new Gift("烤箱","食用",2500,"讓媽媽烤餅乾給我吃"));
		gifts.add(new Gift("手寫卡片","DIY",null,"媽媽我愛你，謝謝你的付出"));
		gifts.add(new Gift("紅包","現金",600,"媽媽請省點用 心意比較重要"));
		System.out.println(gifts);
		// 請問此次母親節總共花費多少錢?
		int total = 0;
		for(Gift gift:gifts) {
			if(gift.getPrice()!=null) {
				total+= gift.getPrice();
			}
		}
		System.out.println("總花費金額:"+total);
		//-----------------------------------------------
		//-----------------------------------------------
		int total2 = gifts.stream()
						  .filter(gift -> gift.getPrice()!= null)	
						   //.mapToInt(gift -> gift.getPrice()).sum();
						  .mapToInt(Gift::getPrice).sum();
		System.out.printf("總花費金額:%,d%n",total2);
	}

}
