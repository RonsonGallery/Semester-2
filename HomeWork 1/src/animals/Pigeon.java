package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Pigeon extends AirAnimal {
	
	private String family;
	
	//default constructor
	public Pigeon() {
		super();
		family = "Albino"; 
	}
	
	public Pigeon(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,double wingspan,String family) {
		super(name,gender,weight,speed,position,medals,wingspan);
		this.family = family;
	}
	
	
	public String getFamily() {
		return family;
	}

	public boolean setFamily(String family) {
		if(family!=null) {
			this.family = family;
			return true;
		}
		System.out.println("Empty family name has been recived");
		return false;
	}

	@Override
	public String getSound() {
		return "Arr-rar-rar-rar-raah";
	}
	
	public String toString() {
		return super.toString() + " Pidgeons family: " + this.family;
	}

}
