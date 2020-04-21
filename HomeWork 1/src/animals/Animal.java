package animals;
import mobility.Mobile;
import mobility.Point;

import java.util.ArrayList;

import Olympics.Medal;

public abstract class Animal extends Mobile {
	private String name;
	private GenderType gender;
	private double weight;
	private double speed;
	private Point position;
	private ArrayList<Medal> medals;
	
	public enum GenderType {
		Male,
		Female,
		Hermaphrodite;
	}

	//default constructor
	public Animal() {
		super();
		this.name = "Charles";
        this.gender = GenderType.Male;
        this.weight = 42;
        this.speed = 3;
        this.medals = new ArrayList<Medal>();
	}

	public Animal(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals) {
		super();
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		
		if(speed < 0) {
			this.speed = 1;
		}
		else if(speed > IReptile.MAX_SPEED) {
			this.speed = IReptile.MAX_SPEED;
		}
		else {
			this.speed = speed;			
		}
		
		this.position = new Point(position.getX(),position.getY());
		this.medals = medals;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if(name != null) {
			this.name = name;
			
			return true;
		}
		System.out.println("invalid name");
		
		return false;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public boolean setWeight(double weight) {
		if(weight >= 0) {
			this.weight = weight;
			
			return true;
		}
		System.out.println("invalid Weight");
		
		return false;
	}
		
	public double getSpeed() {
		return speed;
	}

	public boolean setSpeed(double speed) {
		if(speed < 0) {
			System.out.println("invalid Speed");
			
			return false;
		}
		else if(speed > IReptile.MAX_SPEED) {
			this.speed = IReptile.MAX_SPEED;
			
			return true;
		}
		this.speed = speed;			

		return true;
	}

	public Point getPosition() {
		return position;
	}
	
	public boolean setPosition(Point position) {
		if(position != null) {
			this.position = position;
			return true;
		}
		return false;
	}

	public abstract String getSound();

	public void makeSound() {
		 System.out.println(  this.getName() + " " +   " makes sound =  " + getSound());
	}
	
	public boolean addMedal(Medal medal) {
		medals.add(medal);
		
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", weight=" + weight + ", speed=" + speed + ", position="
				+ position.toString() + ", medals=" + medals.toString();
	}
}
