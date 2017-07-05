public interface IHotelChain {
	public abstract IRoom createRoom();
	public abstract IReservation createReservation();
	public abstract ICustomer createCustomer();
}
