package edu.asu.foa.algo.design.patterns;

public class Saddle implements Isaddle{

	IPony pony;
	
	public Saddle(IPony pony) {
		this.pony = pony;
	}
	
	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("Pony with a saddle");
		pony.ride();
	}

	
}
