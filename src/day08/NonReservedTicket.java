package day08;


//自由座票
public class NonReservedTicket extends Ticket {
	
	public NonReservedTicket() {
		price = 510;
	}
	
	@Override
	public void ticketInfo() {
		System.out.printf("🎫自由座票(不保證有位置) $%,d\n",price);
	}	
}
