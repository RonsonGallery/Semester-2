package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Cat extends TerrestrialAnimals {

	private boolean castrated;
	
	//default constructor
	public Cat() {
		super();
		castrated = false;
	}
	
	public Cat(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,int noLegs,boolean castrated) {
		super(name,gender,weight,speed,position,medals,noLegs);
		this.castrated = castrated; 
	}
	
	@Override
	public String getSound() {
		return "Meow";
	}

	public boolean isCastrated() {
		return castrated;
	}

	public void setCastrated(boolean castrated) {
		this.castrated = castrated;
	}
	public String toString() {
		return super.toString() + "is the cat castrated?: " + this.castrated;
	}
}
