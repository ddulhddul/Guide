import java.util.*;

public class HotelSerarchService {
	ArrayList<Room> rooms = new ArrayList<Room>();

	public void addRoom(Room room) {
		rooms.add(room);
	}
	public void deleteRoom(Room room) {
		rooms.remove(room);
	}
	public void findRooms() {
		System.out.println("===Find Room===");
		Iterator<Room> iterator = rooms.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==============");
	}
}