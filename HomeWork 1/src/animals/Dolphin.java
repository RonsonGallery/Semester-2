package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Dolphin extends WaterAnimal {
	private Watertype type;
	
	public enum Watertype{
		Sea,
		Sweet;
	}

	//default constructor
	public Dolphin() {
		super();
		type = Watertype.Sea; 
	}
	
	public Dolphin(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,double diveDept ,Watertype type) {
		super(name,gender,weight,speed,position,medals,diveDept);
		this.type = type;
		
	}


	public Watertype getType() {
		return type;
	}

	public void setType(Watertype type) {
		this.type = type;
	}

	public String getSound() {
		return "Click-Click";
	}

	public String toString() {
		return super.toString() + "Dolphins water type: " + this.type;
	}
}
