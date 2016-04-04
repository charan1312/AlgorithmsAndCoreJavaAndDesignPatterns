package edu.asu.foa.algo.design.patterns;

public abstract class EnemyShip {
	
	private String name;
	
	ESWeapon weapon;
	EsEngine engine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	abstract void makeShip();
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the Hero at " + engine);
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does "+ weapon);
	}
	
	public String toString() {
		String infoShip = "The "+ name + " has a top speed of " + engine + " and the attack power of " + weapon;
		
		return infoShip;
	}
}
