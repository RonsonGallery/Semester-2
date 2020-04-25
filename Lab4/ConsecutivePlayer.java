package Lab4;

public class ConsecutivePlayer extends Player {
	private int lastIdx;

	public ConsecutivePlayer(String name) {
		super(name);
		this.lastIdx = 0;
	}

	@Override
	public Action selectAction(Action[] actions) {
		lastIdx++;
		if(lastIdx == actions.length||lastIdx > actions.length) {
            lastIdx = 0;
		}
        return actions[lastIdx];
	}
}
