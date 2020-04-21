package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Dog extends TerrestrialAnimals {
	private String breed;
	
	//default constructor
	public Dog() {
		super();
		breed = "None";
	}
	
	public Dog(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,int noLegs,String breed) {
		super(name,gender,weight,speed,position,medals,noLegs);
		if(breed != null) {
			this.breed = breed; 
		}
	}
	
	@Override
	public String getSound() {
		return "Woof Woof";				
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String toString() {
		return super.toString() + "The dogs breed is: " + this.breed;
	}
}
