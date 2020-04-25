package Lab4;

public abstract class Game {
	
	private Player p1, p2;
	private String name;     // The name of the game begin played
	protected Action[] actions; // Possible actions

	public Game(Player p1, Player p2, String name){
		this.p1=p1;
        this.p2=p2;
        this.name = name;
	}

	protected abstract void initActions();

	public void play(int turnCount) {
		 for(int i = 0;i < turnCount;++i) {
			 playSingleTurn();
		 }
	}

	private void playSingleTurn() {
		rewardPlayers(p1.selectAction(actions),p2.selectAction(actions));
	}
	// There is no real scoring strategy in a general game 
	protected abstract void rewardPlayers(Action a1, Action a2);
	
	public Player getWinner () {
		if(p1.isWinner(p2)) {
			return p1;
		}
		else {
			return p2;
		}
	}

	protected Player getFirstPlayer() {
		return this.p1;
	}

	protected Player getSecondPlayer() {
		return this.p2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
