package day05;

// 民宿
public class BedAndBreakfast {
	//服務與餐點
	public static void main(String[] args) {
		Transport airport = new Transport("機場接送",500);
		Transport trainstation = new Transport("高鐵接送",200);
		Transport self = new Transport("自行前往",20);
		Breakfast breakfastA = new Breakfast(150);
		Breakfast breakfastB = new Breakfast(350);
		//建立房間
		Room room1 = new Room("南洋風", 4 , 4500 , breakfastB, airport);
		Room room2 = new Room("工業風", 2 , 2000 , breakfastA, self);
		// 房間資料列印出
		Object[] rooms = {room1,room2};
		for (Object room:rooms) {
			System.out.println(room);
		}
		System.out.println("------------------------------------");
		
		int total = 0;
		for(Object room: rooms) {
			System.out.println(room);
			if(room instanceof Room) {
				total+=((Room) room).getPrice();
			}
		}
		System.out.println("---------------------");
		System.out.printf("總價:%,d%n",total);
	}
	
}
