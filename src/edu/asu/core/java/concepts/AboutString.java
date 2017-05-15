package edu.asu.core.java.concepts;

public class AboutString {

	public static void main(String[] args) {
		
		String a =  new String("xyz");
		String b =  new String("xyz");
		
		//When we use NEW operator to create a String object, I think evrytime a new object is created and STRINGPOOL is NOT USED to
		// see if a similar string exists in the STRINGPOOL( to assign a reference to the existing object)
		
		if(a == b)       // FALSE
			System.out.println("a,b Equal");
		else
			System.out.println("a,b not equal");                      
		
		String c =  "xyz";
		String d =  "xyz";
		
		//WHEN we DONOT use NEW STRING() operator to create a string variable/object, STRINGPOOL reference is checked and used if
		//similar object already exists.
		
		if(c == d)        // TRUE
			System.out.println("c,d Equal - Stringpool");
		else
			System.out.println("c,d not equal");

		
		if(a.equals(b))
			System.out.println("a,b Equal with Equals");
		else
			System.out.println("a,b not equal with equals");

		if(c.equals(d))
			System.out.println("c,d Equal with Equals");
		else
			System.out.println("c,d not equal with equals");

	}
}
