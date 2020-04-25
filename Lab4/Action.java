package Lab4;

public class Action {
	private String name;
	
	public Action(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Object other) {
		return (this == other);
	}
}
