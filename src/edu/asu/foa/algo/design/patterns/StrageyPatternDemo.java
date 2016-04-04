package edu.asu.foa.algo.design.patterns;

public class StrageyPatternDemo {

	public static void main(String[] args) {
		
		Animal sparky = new Dog();
		
		Animal tweety = new Bird();
		
		System.out.println("Dog:" + sparky.tryToFly());
		System.out.println("Bird:" + tweety.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog:" + sparky.tryToFly());
		
	}
}
