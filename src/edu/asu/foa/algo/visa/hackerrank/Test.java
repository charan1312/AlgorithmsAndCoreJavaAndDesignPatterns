package edu.asu.foa.algo.visa.hackerrank;

public class Test {

	public static void main(String[] args) {
		
		String a =  "Mahesh";
		
		StringBuilder sb = new StringBuilder(a);
		
		sb.append(" Babu");
		
		System.out.println(sb.toString());
		
		sb.reverse();
		
		String b = sb.toString();
		
		System.out.println(b);
		
	}
}
