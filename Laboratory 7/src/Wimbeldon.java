import java.io.*;
import java.util.*;

public class Wimbeldon {
	public static Player simulateTournament(QueueAsList<Player> playerList) {
		while(playerList.size() >= 2) {
			Player one = (Player) playerList.dequeue();
			Player two = (Player) playerList.dequeue();
			Player winner = simulateGame(one,two);
			playerList.enqueue(winner);
		}
		
		return playerList.dequeue();
	}
	
	public static Player simulateGame(Player first, Player second) {
		int tmp = (int)(Math.random() * 10000);
		
		if(tmp % 2 == 0) {
			first.addScore(10);
			return first;
		}

		second.addScore(10);
		return second;
	}
		
	public static void main(String[] args) {
		QueueAsList<Player> player = new QueueAsList<>();
		for(int i = 0; i < 5; ++i) {
		try {
			File file = new File("Tournament.txt");
			Scanner myReader = new Scanner(file);
			
			while(myReader.hasNextLine()) {
				String line = myReader.nextLine();
				String[] parts = line.split(",");
				String name = parts[0];
				int score = Integer.parseInt(parts[1]);
				player.enqueue(new Player(name, score));
			}
			myReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
			QueueAsList<Player> copycat = new QueueAsList<>(player);
			System.out.println(simulateTournament(copycat));
			try {
			FileWriter myWriter = new FileWriter("Tournament.txt");
			while(!player.isEmpty()) {
				myWriter.write(player.dequeue().toString()+"\n");
			}
			myWriter.close();
			}
			catch (IOException e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
		}
	}
}
