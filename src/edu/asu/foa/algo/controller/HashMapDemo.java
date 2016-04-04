package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<Integer,String>();
		//List<String> vals = new ArrayList<String>();
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		
		//Map<Integer, String> hmcln = hm.clone(); 
		
		List<String> vals =  new ArrayList<String> (hm.values());
		
		Set<Integer> ks = hm.keySet();
		Set<Entry<Integer, String>> es = hm.entrySet();
		
		System.out.println(ks);
		System.out.println(es);
		//hm.put("abc", 2);
		for (String s: vals)
			System.out.print(" " + s);
		
		Iterator<String> it = vals.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + "     ");
		System.out.println(hm.values()+"---------"+ vals);
		
	}

}
