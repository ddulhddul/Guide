public class Main {
	public static void main(String[] args) {
		// findRoom
		HotelSerarchService service = new HotelSerarchService();
		service.addRoom(new Room("Single Room"));
		service.addRoom(new Room("Double Room"));
		service.addRoom(new Room("Suite Room"));
		service.addRoom(new Room("Executive Room"));
		service.findRooms();

		// makeReservation
		Reservation reservation = new Reservation();
		reservation.create();

		// confirmReserevation
		Guest guest = new Guest();
		guest.updateProfile();
		Room room = new Room();
		room.updateStatus();

		// modifyReservation
		// Reservation reservation = new Reservation();
		reservation.update();

		// cancelReservation
		// Reservation reservation = new Reservation();
		reservation.cancel();
	}
}