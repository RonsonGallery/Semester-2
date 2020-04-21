package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public abstract class WaterAnimal extends Animal {

	static final int MAX_DIVE = -800;
	double diveDept;
	
	//default constructor
	public WaterAnimal() {
		super();
		super.setLocation(new Point(50,0));
		diveDept = 0;
		
	}
	
	public WaterAnimal(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals, double diveDept) {
		super(name,gender,weight,speed,position,medals);
		if(diveDept > MAX_DIVE) {
			this.diveDept = -diveDept;
		}
		else {
			System.out.println("invalid diveDept default values will be set");
			this.diveDept = 2;
		}
	}
	
	public double getdiveDept(){
        return this.diveDept;
    }
	
	public void Dive(double dive){
        if(dive > 0){
            dive += -dive;
        }
        
        if(diveDept + (-dive) < MAX_DIVE){
        	this.diveDept = MAX_DIVE;
        	System.out.println("You have hit max dive depth");
        }
        else {
        	this.diveDept += (-dive);
        }      
	}
	
	public String toString() {
        return "Diving depth: " + this.diveDept + super.toString();
    }
}
