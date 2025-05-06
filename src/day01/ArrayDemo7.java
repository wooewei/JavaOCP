package day01;

public class ArrayDemo7 {
	public static void main(String[] args) {
		int[] scoresA = {100,80,60};
		int[] scoresB = {40,45,50};
		//求scoreA 的平均
		int sumA = 0;
		for(int x : scoresA) {
			sumA = sumA + x;
		}
		int avgA = sumA / scoresA.length;
		//------------------------------------
		//求scoreB 的平均
		int sumB = 0;
		for(int x : scoresB) {
			sumB = sumB + x;
		}
		int avgB = sumB / scoresB.length;
		//-------------------------------------
		System.out.println("scoreA 的平均:"+avgA );
		System.out.println("scoreB 的平均:"+avgB );
		// 計算delateA 與 deltaB------------------------
		double delatA = 0;
		for(int x : scoresA) {
			delatA = delatA + Math.pow(x - avgA, 2);
		}
		double sdA = Math.sqrt(delatA/ scoresA.length);
		// 計算delatB 與 sdB
		double delatB = 0;
		for(int x : scoresB) {
			delatB = delatB + Math.pow(x - avgA, 2);
		}
		double sdB = Math.sqrt(delatB/ scoresB.length);
		//-------------------------------------------------
		System.out.println("scoresA 標準差:"+sdA);
		System.out.println("scoresB 標準差:"+sdB);
		//-------------------------------------------------
		//判斷集中度
		if(sdA < sdB) {
			System.out.println("scoreA 集中度較高");
		}else {
			System.out.println("scoreB 集中度較高");
		}
	}
	
	
	
}
