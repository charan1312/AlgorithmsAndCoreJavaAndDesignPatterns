package edu.asu.foa.algo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		
		String s = "anajhjhgram";
		String t = "nagaram";
		
		System.out.println(isAnagram(s,t));
	}

	static boolean isAnagram(String s, String t) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> smap = new HashMap<Character,Integer>();
		Map<Character, Integer> tmap = new HashMap<Character,Integer>();
		
		//smap.put('a', 1);
		//System.out.println(smap.get('b'));     #### GAVE null
		
		for(char c: s.toCharArray()) {
			if(smap.get(c) == null)
				smap.put(c,1);
			else	
				smap.put(c,smap.get(c) + 1);
		}
		
		for(char c: t.toCharArray()) {
			if(smap.get(c) != null)
				smap.put(c,smap.get(c) - 1);
			else {
				smap.put(c,1);
			}
		}
		
		for(int v : smap.values()) {
			if(v != 0)
				return false;
		}
/*		for(char c: t.toCharArray()) {
			tmap.put(c,tmap.get(c) + 1);
		}
*/		
		
		return true;
	}
}
