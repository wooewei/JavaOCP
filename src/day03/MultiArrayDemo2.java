package day03;

public class MultiArrayDemo2 {
	
	public static void main(String[] args) {
		// ttt 井字遊戲
		char[][] ttt = {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', ' '}};
		// 請問 'O' 要放在哪裡就會贏  ?
		// 並印出棋盤
		System.out.println(ttt[0]); //char陣列就是字串
		System.out.println(ttt[1]); 
		System.out.println(ttt[2]); 
		System.out.println("-------");
		ttt[2][2] = 'O';
		System.out.println(ttt[0]); 
		System.out.println(ttt[1]); 
		System.out.println(ttt[2]); 
		
	
		
		
	}
}
