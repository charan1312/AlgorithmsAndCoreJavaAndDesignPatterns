package edu.asu.foa.algo.controller;

public class AccessModifierTestImpl {

	public static void main(String[] args) {
		AccessModifierTest atout = new AccessModifierTest();
		//atout.mesg();        //CANT ACCESS mesg() since it is declared private in that class
		atout.mesg1();
		
		atout.mesgprotected();
		
		System.out.println(atout.hashCode());
	}
}