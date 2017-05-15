package edu.asu.core.java.concepts;

public interface InterfaceWithConstant {

	String str1 = "America"; // Cant change this value in the implementing class
	//public String str2; // Can't keep it un-initialized
	
	public String changeStr1(String a);
}
