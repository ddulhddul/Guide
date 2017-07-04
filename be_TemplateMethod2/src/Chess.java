public class Chess extends Game{
 
    public void make(String[] players, int j) {
		// make Play Chess
		// process a turn for the player
		System.out.print(players[j]+"play ");
		count++;
	}
	public boolean endOfGame() {
        // Return true if in Checkmate or 
        // Stalemate has been reached
    	if(count>=3) {
    		return true;
    	}
    	return false;
    }
}
