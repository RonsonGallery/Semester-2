package Lab4;


public class Driver {
	public static void main(String[] args) {
		Player player1 = new RandomPlayer("Bob");
		Player player2 = new ConsecutivePlayer("Patrisha");
		
		Game game = new RockPaperScissors(player1,player2);
		game.play(5);
		System.out.println("The winner is: "+ game.getWinner().getName());
		player1.updateScore(player1.getScore() - player1.getScore());
		player2.updateScore(player2.getScore() - player2.getScore());
		
		Game game1 = new PrisonersDilemma(player1,player2);
		game1.play(5);
		System.out.println("The winner is: " + game1.getWinner().getName());
	}
}
