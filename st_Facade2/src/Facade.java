public class Facade implements IFacade {

	public void cancelReservation() {
		// cancelReservation
		Reservation reservation = new Reservation();
		reservation.cancel();
	}

	public void modifyReservation() {
		// modifyReservation
		Reservation reservation = new Reservation();
		reservation.update();
	}

	public void confirmReserevation() {
		// confirmReserevation
		Guest guest = new Guest();
		guest.updateProfile();
		Room room = new Room();
		room.updateStatus();
	}

	public void makeReservation() {
		// makeReservation
		Reservation reservation = new Reservation();
		reservation.create();
	}

	public void findRoom() {
		// findRoom
		HotelSerarchService service = new HotelSerarchService();
		service.addRoom(new Room("Single Room"));
		service.addRoom(new Room("Double Room"));
		service.addRoom(new Room("Suite Room"));
		service.addRoom(new Room("Executive Room"));
		service.findRooms();
	}
}
