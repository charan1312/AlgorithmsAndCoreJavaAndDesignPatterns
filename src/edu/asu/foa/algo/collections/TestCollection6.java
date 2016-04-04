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
	}  
}