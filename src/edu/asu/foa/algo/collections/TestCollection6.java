package edu.asu.foa.algo.collections;

import java.util.*;  
class TestCollection6{  
	public static void main(String args[]){  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ajay");  
		ArrayList<String> al2=new ArrayList<String>();  
		al2.add("Ravi");  
		al2.add("Hanumat");  

		al.addAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2...");
		  
		ListIterator itr=al.listIterator(); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

		  
		Set<String> al_s=new HashSet<String>();  
		al_s.add("Ravi");  
		al_s.add("Vijay");  
		al_s.add("Ajay");  
		Set<String> al2_s=new HashSet<String>();  
		al2_s.add("Ravi");  
		al2_s.add("Hanumat");  

		al_s.addAll(al2_s); 
		
		
		System.out.println("iterating the elements after retaining the elements of al2...");
		Iterator itr1=al_s.iterator(); 
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}
  
	}  
}