package edu.asu.foa.algo.controller;

public class Searching {
	
	int[] a;
	
	public static void main(String[] args) {
		
		Searching s =  new Searching();
		s.a = new int[] {23,23,12,1,23,232,2,123,234,4,35,36,54,56,7,568,67,85,634534,54,53,42,34,325,34,64,57,6,7867};
		
		boolean flag  = s.binarySearch(s.a,57);

		
		if (flag ==  true)
			System.out.println("Found");
		else
			System.out.println("NOT FOUND");
	}
	
	public boolean linearSearch(int[] a,int k) { 
		for(int i=0;i<a.length;i++) {
			if(a[i] == k)
				return true;
		}
		return false;
	}
	
	public boolean binarySearch(int[] a,int k) {
		int n = a.length;
		int first = 0;
		int last = n-1;  
		int mid = (first + last) / 2;
		
		while (first <= last){
			if(a[mid] < k) {
				first = mid + 1;
			} else if(a[mid] > k ) {
				last = mid - 1;
			} else {
				return true;
			}
			mid = (first + last) / 2;
		}
		if(first > last)
			return false;
		
		return false;
	}
}
