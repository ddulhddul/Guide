public class HotelChainC implements IHotelChain {
	public IRoom createRoom() {
		return new HotelCRoom();
	};
	public IReservation createReservation() {
		return new HotelCReservation();
	};
	public ICustomer createCustomer() {
		return new HotelCCustomer();
	};
}
