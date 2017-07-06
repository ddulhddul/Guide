public class Main {
    static public void main(String[] args) {
        Car car = new Car();
        // all Print visitor
        // "Visiting " + wheel.getName() + " wheel"
        // "Visiting engine"
        // "Visiting body"
        // "Visiting car"
        
        // all Do visitor
        // "Kicking my " + wheel.getName() + " wheel"
        // "Starting my engine"
        // "Moving my body"
        // "Starting my car"
    }
}
