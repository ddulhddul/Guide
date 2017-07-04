public class BlueMarble {
    protected int playersCount;
    protected String[] players;
    protected int count;
    
    public void go(String[] players) {
    	this.players = players;
        this.playersCount = players.length;
        
        // initialize Players
        // initialize BlueMarble
    	System.out.println("initialize Players()");
        
        int j = 0;
        while (!endOfGame()) {
        	
            // make Play BlueMarble
            // process one turn of player
        	System.out.print(players[j]+"play ");
        	count++; 
        	
            j = (j + 1) % playersCount;
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }

        // print Winner BlueMarble
        // display the winning player
    	System.out.println("\nWinner "+players[(count-1)%playersCount]);
    	
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
