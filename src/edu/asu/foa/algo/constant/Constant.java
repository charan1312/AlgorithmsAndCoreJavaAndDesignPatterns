package edu.asu.foa.algo.constant;

public class Constant {
	
	public final static int N ;	
	
	static {
		N = 99;
	}

	//IF we comment out the above static block v vl see an error
	// so it means:
	// 1. We can declare a FINAL STATIC variable and not assign a value if we r doing it thru a static block
	// 2. A final static VARIABLE must either be assigned a value when its declared OR assigned a value using static block
}
