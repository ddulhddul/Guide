public class Monopoly {
    protected int playersCount;
    protected String[] players;
    protected int count;
	
    public void start(String[] players) {
    	this.players = players;
        this.playersCount = players.length;
        
        // initialize Players
        // initialize money
    	System.out.println("initialize Players()");
        
        int j = 0;
        while (!endOfGame()) {
        	
            // make Play Monopoly
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

        // print Winner Monopoly
        // display winner 
    	System.out.println("\nWinner "+players[(count-1)%playersCount]);
    	
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
