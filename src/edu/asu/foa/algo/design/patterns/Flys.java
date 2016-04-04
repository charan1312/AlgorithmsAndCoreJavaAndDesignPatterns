package edu.asu.foa.algo.design.patterns;

public interface Flys {

/*
	public void fly();     // To resolve the fly() property issue in Animal class, we can define an interface (to be implemented 
						   //   by the Animal class) -- Just Forces all Animals to figure out how they gonna use this class
						   //       **************** BAD DESIGN *********** Cant force a class to create a method
*/
	String fly();             // STRATEGY PATTERN STARTS
								
}

class ItFlys implements Flys {		//
									//		Now use this interface as an instance variable in the Animal class
	@Override						//	   -- Then we can dynamically change this instance to instantiate either
	public String fly() {			//		  --   of the ItFlys or CantFly class
		return "Flying High";		//   
	}								//      By this way - If more classes with different implementation comes, we can add them 
									//       as well --- eliminates the data duplication
}									//
									//		**  Introduces a technique call DECOUPLING  
									//           - We are encapsulating the concept/behavior that varies -- ability to fly
class CantFly implements Flys {		//
									//
	@Override						//
	public String fly() {			//
		return "I cant Fly";		//
	}								//
									//
}									//