package edu.asu.foa.algo.paypal.intvw;

public class StringReverse {

	static StringBuilder as = new StringBuilder();

	public static void main(String[] args) {

		String a = "abcdefghi";
		String ans = reverseStringRecursion2(a);
		System.out.println("---"+ ans);

	}

	static String reverseStringRecursion1(String s) {
		if(s.length()>0) {
			as.append(s.charAt(s.length()-1));
			reverseStringRecursion1(s.substring(0, s.length() - 1));
		}
		return as.toString();
	}

	static String reverseStringRecursion2(String s) {
		if((null == s) || (s.length() == 1 ) )
			return s;
		return reverseStringRecursion2(s.substring(1)) + s.charAt(0);
	}
}
