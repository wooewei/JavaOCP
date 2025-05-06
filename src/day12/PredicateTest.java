package day12;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

	public static void main(String[] args) {
		// 利用Prdeicate 判斷成績是否及格 ?
		Predicate<Integer> check = (score) -> score >= 60;
		System.out.println(check.test(85));
		System.out.println(check.test(55));
		
		// Consumer + Function + Predicate 應用
		String[] names = {"Amy","Bob","Cindy",null,"David","Eddison"};
		// 請印出每個名字有幾個字 ? null要排除
		// Predicate:請filter 過濾 null
		// Function:利用mapToInt 將字串(名字)轉數字(名字長度)
		// Consumer:利用foreach將資料印出
		 Stream.of(names)
         	.filter(name -> name != null)
         	.mapToInt(name -> name.length())
		 	.forEach(nameLength -> System.out.println(nameLength));
         
	}

}
