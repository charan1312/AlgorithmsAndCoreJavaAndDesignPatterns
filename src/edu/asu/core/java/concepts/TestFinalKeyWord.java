package edu.asu.core.java.concepts;

import java.util.Random;


public class TestFinalKeyWord {
	
	public static final int STATICFINAL = 78;	// if both static and final v have to assign some value to the variable and V cant change tht val
	public static int OBJCNT ;	// if static v dont have to assign some value to the variable, assigns def value
	protected int var1 = 200;
	private final int KK ;
	
	static{
		//STATICFINAL = 0 ;               //if its initialized in frst line then this will give error
		System.out.println("Static block first");
	}
	
	public TestFinalKeyWord() {
		// TODO Auto-generated constructor stub
		KK = 99;
		System.out.println("Constructor-par");
		++OBJCNT;
		//STATICFINAL++;        - I can't modify the value of the final variable
		//KK++;
	}
	public int getVar1() {
		return var1;
	}
	
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	//public final int modifyVar1() {      // If I put this method FINAL i cannot override this method in the child classes
	public int modifyVar1() {   
		Random rand = new Random(7);
		var1 = rand.nextInt();
		return var1;
	}
	
	public final int objCount() {
		return OBJCNT;
	}

	public static void main(String[] args) {
		System.out.println(STATICFINAL);
	}

}
