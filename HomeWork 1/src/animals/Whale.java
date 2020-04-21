package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Whale extends WaterAnimal {

	private String foodType;

	//default constructor
	public Whale() {
		super();
		foodType = "Shrimp"; 
	}
	
	public Whale(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,double diveDept,String foodType) {
		super(name,gender,weight,speed,position,medals,diveDept);
		this.foodType = foodType;
		
	}


	public String getfoodType() {
		return foodType;
	}

	public void setfoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public String getSound() {
		return "Splash";
	}
	
	public String toString() {
		return super.toString() + "Food that the whale eats: " + this.foodType;
	}
}
