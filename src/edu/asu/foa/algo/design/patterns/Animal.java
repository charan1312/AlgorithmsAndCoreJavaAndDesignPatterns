package edu.asu.foa.algo.design.patterns;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	public Flys flyingType;           // called COMPOSITION  -- flyingType knows all the available behavior to its subclasses 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
		else
			System.out.println("Weight must be above 0");
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
/*
	public void fly() {                         // This is bad implementation to add the fly() method in this super class                         
		System.out.println("I am flying");		// because this does not relate to all the subclasses like Dog,C
												// and so we have to overwrite the fly() in all non flying classes
	}											//         *****************************************
												//   If we remove this in Animal and put in Bird class, we have to put it in 
												//     all the Birds that can fly   -- Duplication Code
												//       **********************************************
*/	
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
