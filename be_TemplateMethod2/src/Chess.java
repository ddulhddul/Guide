public class Chess {
    protected int playersCount;
    protected String[] players;
    protected int count;
 
    public void play(String[] players) {
    	this.players = players;
        this.playersCount = players.length;
        
        // initialize Players
        // put the pieces on the board
    	System.out.println("initialize Players()");
    	
        int j = 0;
        while (!endOfGame()) {
        	
            // make Play Chess
            // process a turn for the player
        	System.out.print(players[j]+"play ");
        	count++;
        	
            j = (j + 1) % playersCount;
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        
        // print Winner Chess
        // display the winning player
    	System.out.println("\nWinner "+players[(count-1)%playersCount]);
    	
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
