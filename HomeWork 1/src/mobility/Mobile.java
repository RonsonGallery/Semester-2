package mobility;
import java.lang.Math;

public abstract class Mobile implements ILocatable {

	private Point location;
	private double totalDistance;
	
	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	
	// Constructor for empty location
	public Mobile() {
		this.location = new Point();
		this.totalDistance = 0;
	}
	
	//Constructor for an existing location
	public Mobile(Point location) {
		this.location = new Point(location.getX(), location.getY());
		this.totalDistance = 0;
	}
	
	public void addTotalDistance(double distance) {
		this.totalDistance += distance; 
	}
	
	public double calcDistance(Point point) {
		return Math.sqrt((location.getY() - point.getY()) * (location.getY() - point.getY()) +
                (location.getX() - point.getX()) * (location.getX() - point.getX()));
    }
	
	public double move(Point location) {
		double traveled = calcDistance(location);
		
		addTotalDistance(traveled);
		this.location = location;

		return traveled;
		
	}
	
	
	public Point getLocation() {
		return location;
	}


	public boolean setLocation(Point point) {
		if(point.getX() < 0 || point.getY() < 0) {
			return false;
		}
		
		this.location.setX(point.getX());
		this.location.setY(point.getY());
		
		return true;
	}

	@Override
	public String toString() {
		return "Mobile [location=" + location.toString() + ", totalDistance=" + totalDistance + "]";
	}
}