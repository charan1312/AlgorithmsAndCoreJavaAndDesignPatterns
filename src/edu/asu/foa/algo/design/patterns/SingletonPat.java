package edu.asu.foa.algo.design.patterns;

public class SingletonPat {

	public static SingletonPat inst = null;

	public static SingletonPat getInst() {
		if(inst ==null)
			return new SingletonPat();
		else
			return inst;
	}

	private SingletonPat() {
		// cant instantiate because of private constructor
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}	
}
