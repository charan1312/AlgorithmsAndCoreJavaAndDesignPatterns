package edu.asu.foa.algo.controller;

public class StaticBlocTest {
	
/*	static int a;
	
	public StaticBlocTest() {
		// TODO Auto-generated constructor stub
		a = 50;
		System.out.println("Constructor method");
		System.out.println("A value in Cons:" + a);
	}
	
	static{
		System.out.println( "Static block BEFORE main method in class");
		a = 10;
		System.out.println("A Value:" + a);
	}

	public static void main(String[] args) {
		StaticBlocTest s = new StaticBlocTest();
		System.out.println("Main method");
		System.out.println("A val in main:" + a);
		
	}
	
	static{
		a = 20;
		System.out.println( "Static block AFTER1 main method in class");
		System.out.println("A value:" + a);
	}
	
*/
	static {
		System.out.println("\nI'm static block 1..");
		setTestString("This is static block's String");
		setTestValue(2);
	}
 
	// 2nd static blocks in same class
	static {
		System.out.println("\nI'm static block 2..");
	}
 
	// static variable example
	private static int testValue; // kept private to control it's value through setter
 
	public int getTestValue() {
		return testValue;
	}
 
	// static method example
	public static void setTestValue(int testValue) {
		if (testValue > 0)
			StaticBlocTest.testValue = testValue;
		System.out.println("setTestValue method: " + testValue);
	}
 
	public static String testString;
 
	/**
	 * @return the testString
	 */
	public static String getTestString() {
		return testString;
	}
 
	/**
	 * @param testString the testString to set
	 */
	public static void setTestString(String testString) {
		StaticBlocTest.testString = testString;
		System.out.println("setTestString method: " + testString);
	}
 
	// static util method
	public static int subValue(int i, int... js) {
		int sum = i;
		for (int x : js)
			sum -= x;
		return sum;
	}
	
	public static void main(String[] args) {
		StaticBlocTest.setTestValue(5);
 
		// non-private static variables can be accessed with class name
		StaticBlocTest.testString = "Assigning testString a value";
		StaticBlocTest csd = new StaticBlocTest();
		System.out.println("----" +csd.getTestString());
 
		// class and instance static variables are same
		System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
		System.out.println(StaticBlocTest.testString == csd.testString);
		System.out.println("Why? Because: StaticBlocTest.testString == csd.testString");
	}
}
