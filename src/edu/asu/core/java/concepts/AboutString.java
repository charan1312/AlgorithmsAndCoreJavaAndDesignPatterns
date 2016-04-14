package edu.asu.core.java.concepts;

public class AboutString {

	public static void main(String[] args) {
		
		String a =  new String("xyz");
		String b =  new String("xyz");
		
		if(a == b)
			System.out.println("a,b Equal");
		else
			System.out.println("a,b not equal");
		
		String c =  "xyz";
		String d =  "xyz";
		
		if(c == d)
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
