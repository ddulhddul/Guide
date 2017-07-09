public class Main {
	
	public static void main(String[] args) {
		IFacade f = new Facade();
		f.findRoom();
		f.makeReservation();
		f.confirmReserevation();
		f.modifyReservation();
		f.cancelReservation();
	}
}