package edu.asu.core.java.concepts;

import java.util.Random;

public final class TestFinalOverrideFinalMeth extends TestFinalKeyWord{

	public int child = 99;
	
	public TestFinalOverrideFinalMeth() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor -child");
	}
	public int modifyVar1() {             // IF i put final in the same method in the parent class you will get error here
		Random rand = new Random(7);
		var1 = rand.nextInt();
		return var1;
	}

	public int modifyVar1(int a) {
		Random rand = new Random(a);
		return a + rand.nextInt() ;
	}

	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		this.child = child;
	}
	
	
	
}
