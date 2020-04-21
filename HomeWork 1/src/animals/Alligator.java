package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Alligator extends WaterAnimal {
	private String AreaOfLiving;
	

	
	
	//default constructor
	public Alligator() {
		super();
		AreaOfLiving = "Swamp"; 
	}
	
	public Alligator(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,double diveDept,String AreaOfLiving) {
		super(name,gender,weight,speed,position,medals,diveDept);
		this.AreaOfLiving = AreaOfLiving;
		
	}


	public String getAreaOfLiving() {
		return AreaOfLiving;
	}

	public boolean setAreaOfLiving(String areaOfLiving) {
		AreaOfLiving = areaOfLiving;
		return true;
	}

	public String getSound() {
		
		return "Roar";
	}
	
	public String toString() {
		return super.toString() + "The area of living for the aligator is: " + this.AreaOfLiving;
	}
	
}
