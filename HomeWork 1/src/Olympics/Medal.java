package Olympics;

public class Medal {
	private MedalType type = MedalType.bronze;
	private String tournament = "The default tournament!";
	private int year = 2020;
	
	public enum MedalType {
		bronze,
		silver,
		gold;
	}
	
	public Medal() {
	}

	public Medal(MedalType type, String tournament, int year) {
		this.type = type;
		this.tournament = tournament;
		this.year = year;
	}

	public MedalType getType() {
		return type;
	}

	public void setType(MedalType type) {
		this.type = type;
	}

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "[type=" + type + ", tournament=" + tournament + ", year=" + year + "]";
	}
	
	
}
