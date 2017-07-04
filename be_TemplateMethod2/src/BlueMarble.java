public class BlueMarble extends Game{
    
	public void make(String[] players, int j) {
		// make Play BlueMarble
		// process one turn of player
		System.out.print(players[j]+"play ");
		count++;
	}
    public boolean endOfGame() {
        // Return true if game is over 
        // according to BlueMarble rules
    	if(count>=8) {
    		return true;
    	}
    	return false;
    }
}
