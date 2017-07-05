public class HotelChainA implements IHotelChain {
	public IRoom createRoom() {
		return new HotelARoom();
	};
	public IReservation createReservation() {
		return new HotelAReservation();
	};
	public ICustomer createCustomer() {
		return new HotelACustomer();
	};
}
