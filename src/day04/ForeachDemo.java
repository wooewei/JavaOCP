package day04;

import java.util.stream.Stream;

public class ForeachDemo {
	
	public static void main(String[] args) {
		//For each 
		String[] names = {"Bob","Jack","Rose","Vincent","Anita","Howard","Joanna","Jo"};
		//利用For each 將每一個人名印出，Java 5.0 提供此語法
		for(String name:names) {
			System.out.println(name);
		}
		//利用Stream.of() 提供的 foreach() 方法也有異曲同工之妙，Java 8.0 提供此語法
		Stream.of(names).forEach (name -> {System.out.println(name);});	//標準寫法
		Stream.of(names).forEach (name -> System.out.println(name));
	}	
}
