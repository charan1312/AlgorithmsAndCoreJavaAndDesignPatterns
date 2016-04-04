package edu.asu.foa.algo.controller2;

import edu.asu.foa.algo.controller.AccessModifierTest;

public class AccessModifierTestImpl extends AccessModifierTest {

	public static void main(String[] args) {
		//AccessModifierTest atout = new AccessModifierTest();
		//atout.mesg();        //CANT ACCESS mesg() since it is declared private in that class
		//atout.mesg1();
		
		//atout.mesgprotected();   // cant access this method wihtout extending the main class
		
		AccessModifierTestImpl atimpl =  new AccessModifierTestImpl();
		atimpl.mesg1();
		//atimpl.mesg();
		atimpl.mesgprotected();
		
		
	}
}