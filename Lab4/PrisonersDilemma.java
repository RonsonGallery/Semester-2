package Lab4;

public class PrisonersDilemma extends Game {
	
	public PrisonersDilemma(Player p1,Player p2){
        super(p1,p2,"Prisoner`s Dilemma");
        initActions();
    }
	
	protected void initActions() {
		actions = new Action[2];
		actions[0] = new Action("Silent");
		actions[1] = new Action("Testify");
	}


	protected void rewardPlayers(Action a1, Action a2) {
		if(a1.equals(actions[0]) && a2.equals(actions[0])){
			getFirstPlayer().updateScore(1);
			getSecondPlayer().updateScore(1);
		}
		
		if(a1.equals(actions[1]) && a2.equals(actions[0])){
			getFirstPlayer().updateScore(0);
			getSecondPlayer().updateScore(-15);
		}
		
		if(a1.equals(actions[0]) && a2.equals(actions[1])){
			getFirstPlayer().updateScore(-15);
			getSecondPlayer().updateScore(0);
		}
		
		if(a1.equals(actions[1]) && a2.equals(actions[1])){
			getFirstPlayer().updateScore(-5);
			getSecondPlayer().updateScore(-5);
		}


	}

}
