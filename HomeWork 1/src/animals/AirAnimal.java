package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public abstract class AirAnimal extends Animal {
	private double wingspan;
	
	
	public double getWingspan() {
		return wingspan;
	}

	public boolean setWingspan(double wingspan) {
		if(wingspan > 0) {
			this.wingspan = wingspan;
			return true;
		}
		System.out.println("Invalid wingspan,wingspan has not been changed");
		return false;
	}
	
	//default constructor
	public AirAnimal() {
		super();
		super.setLocation(new Point(0,100));
		this.wingspan = 2;
	}
	
	public AirAnimal(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals, double wingspan) {
		super(name,gender,weight,speed,position,medals);
		if(wingspan > 0) {
			this.wingspan = wingspan;
		}
		else {
			System.out.println("invalid wingspan default values will be set");
			this.wingspan = 2;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " wingspan=" + wingspan;
	}
}
