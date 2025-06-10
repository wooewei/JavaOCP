package day24;

import java.util.Scanner;

public class RacingGame {

	public static void main(String[] args) throws InterruptedException {
		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		Horse horse3 = new Horse();
		Dog dog = new Dog();
		
		Thread t1 = new Thread(horse1, "白馬"); // 讓 t1 執行緒去執行 horse1 的工作(就是 run() 方法)
		Thread t2 = new Thread(horse2, "寶馬"); // 讓 t2 執行緒去執行 horse2 的工作(就是 run() 方法)
		Thread t3 = new Thread(horse3, "赤兔馬");
		Thread t4 = new Thread(dog, "柯基");
		
		// 調整權限
		//t1.setPriority(1);
		//t2.setPriority(Thread.MIN_PRIORITY); // 1
		//t3.setPriority(Thread.MAX_PRIORITY); // 10
		
		// 賞馬並下注
		Scanner scanner = new Scanner(System.in);
		System.out.println("請選擇要下注的馬:");
		System.out.println("1. " + t1.getName());
		System.out.println("2. " + t2.getName());
		System.out.println("3. " + t3.getName());
		System.out.println("4. " + t4.getName());
		System.out.print("==> ");
		int betChoice = scanner.nextInt();
		
		System.out.println("比賽開始");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("比賽結束 Winner:" + Horse.winner);
		// 判斷輸贏
		if(
			(betChoice == 1 && Horse.winner.equals(t1.getName())) || 
			(betChoice == 2 && Horse.winner.equals(t2.getName())) ||
			(betChoice == 3 && Horse.winner.equals(t3.getName())) ||
			(betChoice == 4 && Horse.winner.equals(t4.getName()))
		  ) {
			System.out.println("恭喜獲勝");
		} else {
			System.out.println("槓龜");
		}
		
		scanner.close();
	}

}