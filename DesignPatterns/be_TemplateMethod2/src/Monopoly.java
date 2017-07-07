public class Monopoly extends Game{
	
	public void make(String[] players, int j) {
		// make Play Monopoly
		// process one turn of player
		System.out.print(players[j]+"play ");
		count++;
	}
    public boolean endOfGame() {
        // Return true if game is over 
        // according to Monopoly rules
    	int su=(int)(Math.random()*10)+1;
    	if(su==7) {
    		return true;
    	}
    	return false;
    }
}
