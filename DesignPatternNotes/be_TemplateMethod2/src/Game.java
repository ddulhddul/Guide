public abstract class Game {
    protected int playersCount;
    protected String[] players;
    protected int count;

    public abstract boolean endOfGame();

    public abstract void make(String[] players, int j);

	public final void play(String[] players) {
		this.players = players;
	    this.playersCount = players.length;
	    
	    initialize();
		
	    int j = 0;
	    while (!endOfGame()) {
	    	
	        make(players, j);
	    	
	        j = (j + 1) % playersCount;
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    
	    print(players);
		
	}

	public void print(String[] players) {
		// print Winner Chess
	    // display the winning player
		System.out.println("\nWinner "+players[(count-1)%playersCount]);
	}

	public void initialize() {
		// initialize Players
	    // put the pieces on the board
		System.out.println("initialize Players()");
	}

}
