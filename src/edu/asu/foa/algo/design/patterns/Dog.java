package edu.asu.foa.algo.design.patterns;

public class Dog extends Animal{

	public void digHole() {
		System.out.println("Dug the hole");
	}
	
	public Dog() {
		super();
		setSound("Barks");
		
		flyingType = new CantFly();          // Strategy pattern
	}

/*
	@Override
	public void fly() {                                 //   We can override the fly() method from Animal class 
		System.out.println("I cant fly");               //					But its a bad Design
	}   												//			*************************************
*/
	
	
	
}
