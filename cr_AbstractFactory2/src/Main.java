public class Main{
	public static void main(String[] args)	{
		IHotelChain factory = new HotelChainA();
		ICustomer cust = factory.createCustomer();
		cust.getPreferences();
		IRoom room = factory.createRoom();
		room.getDescription();
		room.getRate();
		IReservation resv = factory.createReservation();
		resv.calculateBill();
		resv.confirm();
	}
}
