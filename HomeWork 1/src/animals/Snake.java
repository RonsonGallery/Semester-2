package animals;

import java.util.ArrayList;

import Olympics.Medal;
import mobility.Point;

public class Snake extends TerrestrialAnimals {


		private double length;
		private Poisonous poision;

		public enum Poisonous{
			poisonous,
			notPoisonous;
		}
		
		//default constructor
		public Snake() {
			super();
			length = 2;
			poision = Poisonous.poisonous;
			noLegs = 0;
		}
		
		public Snake(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals,int noLegs,double length,Poisonous Poision) {
			super(name,gender,weight,speed,position,medals,noLegs);
			this.length = length;
			this.poision = Poision;
			
		}
		
		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public Poisonous getPoision() {
			return poision;
		}

		public void setPoision(Poisonous poision) {
			this.poision = poision;
		}

		@Override
		public String getSound() {
			return "ssssssss";
		}

		public String toString() {
			return super.toString() + "The length of the snake is: " + this.length + "The snake is: " + this.poision;
		}

}
