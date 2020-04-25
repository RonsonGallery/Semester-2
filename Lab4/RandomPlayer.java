package Lab4;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	public Action selectAction(Action[] actions) {
		int random = (int) (Math.random()    *   actions.length);
        return actions[random];
	}
}
