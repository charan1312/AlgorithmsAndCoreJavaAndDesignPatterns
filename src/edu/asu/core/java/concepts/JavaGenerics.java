package edu.asu.core.java.concepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaGenerics {

	public static void main(String[] args) {
		
		Set setOfRawType = new HashSet<String>();
		
		setOfRawType.add("abcd");
		setOfRawType.add(13212);
		
		Iterator  iter = setOfRawType.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		setOfRawType = new HashSet<Integer>();
		setOfRawType.add(2323);
		setOfRawType.add("Ada");
	
		Iterator  iter1 = setOfRawType.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
	}
	
}
