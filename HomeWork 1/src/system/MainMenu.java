package system;
import animals.*;
import animals.Animal.GenderType;
import animals.Snake.Poisonous;
import mobility.Point;
import animals.Dolphin.Watertype;
import java.util.ArrayList;
import java.util.Scanner;

import Olympics.Medal;
import Olympics.Medal.MedalType; 

public class MainMenu {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the amount of animals you would like to insert.");
		int size = scanner.nextInt();
		Animal[] animalArray = new Animal[size];
		
		for(int i = 0;i<size;i++) {
			Animal animal = generateAnimal();
			if(animal == null) {
				--i;
				continue;
			}
			animalArray[i] = animal;
			animal.makeSound();
			System.out.println(animal);
		}
		System.out.println("Completed all tasks press enter to exit");
		scanner.next();
	}
	
	private static Animal generateAnimal() {
		int axisx;
		int axisy;
		String name;
		GenderType gender;
		double weight;
		double speed;
		ArrayList<Medal> medals;
		Animal animal;
		
		System.out.println("Enter animal name");
		name = scanner.next();
		System.out.println("Enter 1 for male 2 for female and 3 for hemafrodite");

		switch(scanner.nextInt()) {
			case 1: 
				gender = GenderType.Male;
				break;
			case 2: 
				gender = GenderType.Female;
				break;
			case 3: 
				gender = GenderType.Hermaphrodite;
				break;
			default: 
				System.out.println("Default value has been selected");
				gender = GenderType.Hermaphrodite;
		}
		
		System.out.println("Enter animal weight: ");
		weight = scanner.nextDouble();
		
		System.out.println("Enter animal speed: ");
		speed = scanner.nextDouble();
		
		System.out.println("Enter x and then y for animal location: ");
		axisx = scanner.nextInt();
		axisy = scanner.nextInt();
		Point position = new Point(axisx,axisy);
		medals = generateMedalList(name);
		
		System.out.println("What type of animal would you like to add: \n"
				+ "1) AirAnimal.\n"
				+ "2) TerrestrialAnimal. \n"
				+ "3) WaterAnimal. ");
		
		switch(scanner.nextInt()) {
			case 1: 
				animal = generateAirAnimal(name, gender, weight, speed, position, medals);
				if(animal == null) {
					return null;
				}
				break;
			case 2: 
				animal = generateTerrestrialAnimalsAnimal(name, gender, weight, speed, position, medals);
				if(animal == null) {
					return null;
				}
				break;
			case 3: 
			animal = generateWaterAnimal(name, gender, weight, speed, position, medals);
			if(animal == null) {
				return null;
				}
				break;
			default: 
				System.out.println("Please enter a valid number.");
				return null;
		}
		return animal;
	}
	
	private static Animal generateAirAnimal(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals) {
		
		System.out.println("Please enter the air animals wingspan.");
		double wingspan = scanner.nextDouble();
		
		System.out.println("What type of air animal would you like to add: \n"
							+ "1) Eagle.\n"
							+ "2) Pigeon. \n");
		
		int choice = scanner.nextInt();
		switch(choice) {
			case 1: 
				System.out.println("Please enter the eagle's altitude of flight.");
				double alt = scanner.nextDouble();
				return new Eagle(name,gender,weight,speed,position,medals,wingspan,alt);
			case 2:
				System.out.println("Please enter the pigeons family.");
				String family = scanner.next();
				return new Pigeon(name,gender,weight,speed,position,medals,wingspan,family);
			default: break;
		}
		return null;
	}
	
	private static Animal generateTerrestrialAnimalsAnimal(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals) {
		System.out.println("Please enter the number of legs.");
		int noLegs = scanner.nextInt();
		
		System.out.println("What type of air animal would you like to add: \n"
							+ "1) Dog.\n"
							+ "2) Snake. \n"
							+ "3) Cat. \n");
		
		int choice = scanner.nextInt();
		switch(choice) {
			case 1: 
				System.out.println("Please enter the dogs breed.");
				String breed = scanner.next();
				return new Dog(name,gender,weight,speed,position,medals,noLegs,breed);
			case 2:
				
				noLegs = 0;
				System.out.println("Please enter 1 if the snake is poisonnous and 2 if not.");
				Poisonous poision;
				switch(scanner.nextInt()) {
					case 1:
						poision = Poisonous.poisonous;
						break;
					case 2:
						poision = Poisonous.notPoisonous;
						break;
					default:
						System.out.println("Default value has been selected");
						poision = Poisonous.poisonous;
						break;
				}
				
				System.out.println("Please enter the snakes length.");
				double length = scanner.nextDouble();
				return new Snake(name,gender,weight,speed,position,medals,noLegs,length,poision);
			case 3:
				System.out.println("Please enter true if cat is castrated false if not");
				boolean cast= scanner.nextBoolean();
				return new Cat(name,gender,weight,speed,position,medals,noLegs,cast);
		}
		return null;
	}
	
	private static Animal generateWaterAnimal(String name, GenderType gender, double weight, double speed, Point position, ArrayList<Medal> medals) {
			
			System.out.println("Please enter the eagle's altitude of flight.");
			double diveDept = scanner.nextDouble();
			
			System.out.println("What type of water animal would you like to add: \n"
								+ "1) Dolphin.\n"
								+ "2) Whale. \n"
								+ "3)Aligator. \n");
			int choice = scanner.nextInt();
			
			Watertype type;	
			
			switch(choice) {
				case 1: {
					System.out.println("Please enter water type 1 for sea 2 for sweet.");
					switch(scanner.nextInt()) {
					case 1:
						type = Watertype.Sea;
						break;
					case 2:
						type = Watertype.Sweet;
						break;
					default:
						System.out.println("Default value has been selected");
						type = Watertype.Sea;
						break;
				}
					return new Dolphin(name,gender,weight,speed,position,medals,diveDept,type);
				}
				case 2: {
					System.out.println("Please enter the type of food for the Whale");
					String foodtype = scanner.nextLine();
					return new Whale(name,gender,weight,speed,position,medals,diveDept,foodtype);
				}
				case 3:
					System.out.println("Please enter the area of living for the Alligator");
					String areaOfLiving = scanner.nextLine();
					return new Alligator(name,gender,weight,speed,position,medals,diveDept,areaOfLiving);
				
			}
		return null;
		}
	
	private static ArrayList<Medal> generateMedalList(String name) {
		ArrayList<Medal> medals = new ArrayList<Medal>();
		
		System.out.println("How many medals does " + name + " have?");
		int count = scanner.nextInt();
		for(int i = 0; i < count; ++i) {
			if(i != 0) {
				System.out.println("Next medal: ");
			}
			System.out.println("When did " + name + " win the medal?");
			int year = scanner.nextInt();
			
			System.out.println("What's the tournament's name " + name + " won?");
			String tournament = scanner.next();
			
			int input = 0;
			MedalType type = null;
			do {
				System.out.println("What type of medal did" + name + " win?\n"
						+ "1) Bronze.\n"
						+ "2) Silver. \n"
						+ "3) Gold.");
				input = scanner.nextInt();
				switch(input) {
					case 1:
						type = MedalType.bronze;
						break;
					case 2:
						type = MedalType.silver;
						break;
					case 3:
						type = MedalType.gold;
						break;
					default:
						System.out.println("please enter a valid option.");
						break;
				}
			}while(input != 1 && input != 2 && input != 3);
			
			medals.add(new Medal(type, tournament, year));
		}
		return medals;
	}
}

