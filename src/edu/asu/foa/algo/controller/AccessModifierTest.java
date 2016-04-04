package edu.asu.foa.algo.controller;

public class AccessModifierTest {

	
	private int a ;
	
	private void mesg() {
		System.out.println("Private mesg--------A value:" + a);
	}
	
	protected void mesgprotected() {
		System.out.println("PRotected Mesg");
	}
	
	//private AccessModifierTest() {
	//	System.out.println("Private Constructor");
	//}
	
	public void mesg1() {
		System.out.println("Public Mesg ---------A value:" + a);
	}
	
	public static void main(String[] args) {
		AccessModifierTest atin = new AccessModifierTest();
		atin.a = 100;
		atin.mesg();
	}

	
}

