package day12;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamDemo1 {

	public static void main(String[] args) {
		int[] scores = {45,55,50,51,40,50,10};
		// 找出一筆及格分數 II
		OptionalInt optInt = Arrays.stream(scores)
										.filter(score -> score >= 60)
										.findAny();
		if(optInt.isPresent()) {
			System.out.println(optInt.getAsInt());
		}else {
			System.out.println("查無資料");
		}
		
	}

}
