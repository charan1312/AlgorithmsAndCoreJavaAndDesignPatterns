package edu.asu.foa.algo.design.patterns;

public class Unicorn implements IUnicorn{

	IPony pony;
	
	public Unicorn(IPony pony) {
		// TODO Auto-generated constructor stub
		this.pony = pony;
	}
	
	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("Unicorn Rides");
		pony.ride();
	}

}
