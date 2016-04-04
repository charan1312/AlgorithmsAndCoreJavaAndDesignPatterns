package edu.asu.foa.algo.controller;

public class StringOperations {
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf.capacity() + "---" + sbf.length());//toString().length());
		sbf.append("abcdefghijklmnop");
		System.out.println(sbf.capacity() + "---" + sbf.length());//toString().length());
		sbf.append("a");
		System.out.println(sbf.capacity() + "---" + sbf.length());//toString().length());
		System.out.println(sbf);
		String a = sbf.toString();
		System.out.println(a.length());
		
		
		StringBuilder sbd =  new StringBuilder("ANC");
		System.out.println(sbd.capacity());
		System.out.println(sbd);
	}
}
