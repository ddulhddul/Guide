public class HotelChainB implements IHotelChain {
	public IRoom createRoom() {
		return new HotelBRoom();
	};
	public IReservation createReservation() {
		return new HotelBReservation();
	};
	public ICustomer createCustomer() {
		return new HotelBCustomer();
	};
}
