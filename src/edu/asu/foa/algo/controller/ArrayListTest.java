package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		str.add("Aaaa");
		str.add("Bbbb");
		str.add("Cccc");
		str.add("Ddddd");
		str.add("Eeeee");
		
		//ArrayList to Array Conversion
		String[] strar = str.toArray(new String[str.size()]);   //new String[str.size()];
		//strar = (String[]) str.toArray();
		
		for (String s  : strar) {
			System.out.println(s);
		}
		
		//System.out.println(str.toArray(new String[str.size()]));
		String[] strar1 = str.toArray(new String[str.size()]);
	}
	
	
}
