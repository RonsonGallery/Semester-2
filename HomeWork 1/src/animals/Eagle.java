package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Eagle extends AirAnimal {

	private double altitudeOfFlight;
	static final int MAX_ALTITUDE = 1000;
	
	//default constructor
	public Eagle() {
		super();
		altitudeOfFlight = 100; 
	}
	
	public Eagle(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,double wingspan,double altitudeOfFlight) {
		super(name,gender,weight,speed,position,medals,wingspan);
		if(altitudeOfFlight > MAX_ALTITUDE) {
			System.out.println("Exeeded max altitude setting 100 as default");
			this.altitudeOfFlight = 100;
		}
		else {
			this.altitudeOfFlight = altitudeOfFlight;
		}
	}

	
	public double getAltitudeOfFlight() {
		return altitudeOfFlight;
	}

	public boolean setAltitudeOfFlight(double altitudeOfFlight) {
		if(altitudeOfFlight > MAX_ALTITUDE) {
			System.out.println("Exeeded max altitude");
			return false;
		}
		this.altitudeOfFlight = altitudeOfFlight;
		return true;
	}

	public String getSound() {
		return "Clack-wack-chack";
	}

	@Override
	public String toString() {
		return super.toString() + " altitudeOfFlight=" + altitudeOfFlight;
	}
	
	
}
