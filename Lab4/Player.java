package Lab4;

public abstract class Player {
	private String name;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	public abstract Action selectAction(Action[] actions);
	
	public boolean isWinner(Player p) {
		return (this.score > p.score);
	}
	
	public void updateScore(int score) {
		this.score += score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}
	
}
