package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public abstract class TerrestrialAnimals extends Animal {

	int noLegs;
	
	//default constructor
	public TerrestrialAnimals() {
		super();
		super.setLocation(new Point(0,20));
		noLegs = 0;
		
	}
	
	public TerrestrialAnimals(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals, int noLegs) {
		super(name,gender,weight,speed,position,medals);
		if(noLegs >= 0) {
			this.noLegs = noLegs;
		}
		else {
			System.out.println("invalid number of legs default values will be set");
			this.noLegs = 0;
		}
	}
	
    public String toString()
    {
        return "Number of legs : " + this.noLegs + super.toString();
    }

}
