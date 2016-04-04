package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestFailFastSafe {

	private List<Integer> ia;
	private Map<Integer, String> map;
	
	private ConcurrentHashMap<Integer, String> cmap;
	
	public static void main(String[] args) {
		
		TestFailFastSafe tffs = new TestFailFastSafe();
		tffs.ia = new ArrayList<Integer>();
		tffs.ia.add(12);
		tffs.ia.add(13);
		tffs.ia.add(14);
		tffs.ia.add(15);
		tffs.ia.add(16);
		
		
		Iterator<Integer> it = tffs.ia.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next() + "   ");
			tffs.ia.set(2,34);//    -- this statement is not giving  ConcurrentModificationException Exception eventhough we are changing the value 
			//tffs.ia.add(34);    //-- this statement gives ConcurrentModificationException Exception
		}
		
		tffs.map = new HashMap<Integer,String>();
		tffs.map.put(1, "one");
		tffs.map.put(2, "two");
		tffs.map.put(3, "three");
		
		
		Set set = tffs.map.entrySet();
		Iterator its = set.iterator();
		while(its.hasNext()) {
			Map.Entry mentry = (Map.Entry) its.next();
			System.out.println(mentry.getKey() + " " +mentry.getValue());
		}
		
		Set setk = tffs.map.keySet();
		
		Iterator<String> it1 = tffs.map.values().iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next() + "   ");
			//it1.
			//tffs.map.put(8,"eight");  // -- this statement gives ConcurrentModificationException Exception
		}
		
		tffs.cmap = new ConcurrentHashMap<Integer,String>();
		tffs.cmap.put(5, "five");
		tffs.cmap.put(6, "six");
		tffs.cmap.put(7, "seven");
		
		Iterator<String> it2 = tffs.cmap.values().iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next() + "   ");
			tffs.cmap.put(8,"eight");  //  -- this statement gives ConcurrentModificationException Exception
		}
	}
}
