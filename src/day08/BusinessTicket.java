package day08;

public class BusinessTicket extends Ticket{
	
	public BusinessTicket() {
		price = 1080;
	}

	@Override
	public void ticketInfo() {
		
			System.out.printf("🎫商務座票(有吃有喝) $%,d\n",price);
	}
	
	
}
