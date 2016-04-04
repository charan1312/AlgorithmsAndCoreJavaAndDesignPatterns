package edu.asu.foa.algo.design.patterns;

public class Bird extends Animal{

	public Bird() {
		super();
		setSound("Tweets");
		
		flyingType = new ItFlys();     //strategy pattern
	}
	
/*
	public void fly() {                       //   We can add the fly() method in Bird class (we need to add in all Bird classes) 
		System.out.println("Flying High");    //					But its a bad Design - Duplication Code
	}   									  //			*****************************************************
*/

}
