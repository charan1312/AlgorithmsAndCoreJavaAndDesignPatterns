package edu.asu.foa.algo.controller;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo {

	static class KeyClass{
		private int a;
		private int b;
		private String c;
	
		public KeyClass(int a,int b,String c) {
			// TODO Auto-generated constructor stub
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "{a= " + a + " b=" + b + " c=" + c +"}";
		}
		
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			boolean res = false;
			if(obj == null || obj.getClass() != getClass()) {
				res =  false;
			} else {
				KeyClass kc = (KeyClass) obj;
				if(this.a == kc.a && this.b == kc.b ) {
					res = true;
				}
			}
			
			return res;
		}
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			int hash = 3;
			hash = 7 * hash + this.a * 31;
			hash = 7 * hash + this.b * 31;
			return hash;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(3, (float) 0.5);
		Enumeration<String> vals = new Enumeration<String>() {
			
			@Override
			public String nextElement() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "four");
		ht.put(5, "five");
		Iterator<String> it = ht.values().iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next().hashCode() + "   --   " );
		}

		
		System.out.println(ht);
		
		vals = ht.elements();
*/
		
		Hashtable<KeyClass, String> ht = new Hashtable<KeyClass, String>(3, (float) 0.5);
	
		KeyClass k1 = new KeyClass(1, 2, "onetwo");
		KeyClass k2 = new KeyClass(2, 3, "twothree");
		KeyClass k3 = new KeyClass(1, 2, "threefour");
		
		System.out.println(k1.hashCode() + "-" + k2.hashCode() + "-" + k3.hashCode());
		
		Integer a = 10;
		System.out.println(a.hashCode());
		
		ht.put(k1,"k1");
		ht.put(k2,"k2");
		ht.put(k3,"k3");
	
		System.out.println(ht.keySet().size());
		Enumeration<KeyClass> it = ht.keys();
		
		while (it.hasMoreElements()) {
			KeyClass k = it.nextElement();
			System.out.println(k.toString() + k.hashCode() + k.c);
		}
	
	}

	 
}
