package edu.asu.core.java.concepts;

public class InterfaceWithConsImpl implements InterfaceWithConstant {

	@Override
	public String changeStr1(String a) {
		
		//this.str1 = a ;     // CAnt change the value of the final variable from the interface

		return str1;
	}

	
}
