package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	List<Integer> arb = new ArrayList<Integer>();
	
	int[] arb1; // = new int[] {6,5,3,1,8,7,2,4 }; 
			//{9,8,7,6,5,4,3,2,1,0};
			//{ 63,34,54,5762,323,324,56,76,454,32 };
	
	int[] arb2 = new int[] {1,2,3};
	
	
	public Sorting() {
		// TODO Auto-generated constructor stub
		arb.addAll(Arrays.asList(63,34,54,5762,323,324,56,76,454,32));
	}
	
	public void selectionSort() {
		for(int i=0;i<arb1.length;i++) {
			int min = i;
			for(int j=i+1;j<arb1.length;j++) {
				if(arb1[j] < arb1[min]) {
					min = j;
				}
			}
			
			int temp = arb1[i];
			arb1[i] =arb1[min];
			arb1[min] = temp;
			
			System.out.println("\nAfter pass: " + (i+1));
			for(int k=0;k<arb1.length;k++)
				System.out.print(arb1[k] + " " );
		}
		
		for(int i=0;i<arb1.length;i++)
			System.out.print(arb1[i] + " " );
	}
	
	public void bubbleSort() {
		for(int j=0; j<arb1.length; j++) {
			for(int i=0; i<(arb1.length - (j+1)) ;i++) {
				//System.out.println(arb1[i] + " " + arb1[i+1]);
				if(arb1[i] > arb1[i+1]) {
					int temp = arb1[i+1];
					arb1[i+1] =arb1[i];
					arb1[i] = temp;
				}
			}
			System.out.println("\nAfter pass: " + (j+1));
			for(int k=0;k<arb1.length;k++)
				System.out.print(arb1[k] + " " );
		}
	}
	
	public void insertionSort() {
		int k;
		for(int i=1;i<arb1.length;i++) {
			k=i;
			while(k>0 && arb1[k] < arb1[k-1]) {
				int temp = arb1[k-1];
				arb1[k-1] = arb1[k];
				arb1[k] = temp;
				k--;
			}
			System.out.println("\nAfter pass: " + (i));
			for(int l=0;l<arb1.length;l++)
				System.out.print(arb1[l] + " " );
		}
	}
	
	public static void main(String[] args) {
		Sorting s = new Sorting();
		s.arb1 = new int[] {6,5,3,1,8,7,2,4 };
		s.insertionSort();
		s.arb1 = new int[] {6,5,3,1,8,7,2,4 };
		s.selectionSort();
		s.arb1 = new int[] {6,5,3,1,8,7,2,4 };
		s.bubbleSort();
		
		System.out.println("\nMErge Sort:");
		s.arb1 = new int[] {34,324,2345,45,232,234,354,23423,42343,44,43,2,3423,4234,32,432,432,4,234,23,423};
		s.mergeSort(s.arb1);
		for(int l=0;l<s.arb1.length;l++)
			System.out.print(s.arb1[l] + " " );
		
	}
	
	public void mergeSort(int[] a) {
		int n;
		int mid;
		int left[];
		int right[];
		
		n= a.length;
		System.out.println("N VAL:" + n);
		if(n<2)
			return;
		
		mid = n/2;
		left = new int[mid];
		right = new int[n-mid];
		System.out.println("Left:");
		for(int i=0;i<mid;i++) {
			left[i] = a[i];
			System.out.print(" " + left[i]);
		}
		System.out.println("Right:");
		for(int i=mid;i<n;i++) {
			right[i-mid] = a[i];
			System.out.print(" " + right[i-mid]);
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
	}
	
	public void merge(int[] left, int[] right,int[] total) {
		int lcnt;
		int rcnt;
		int i = 0;
		int j = 0;
		int k = 0;
		
		lcnt = left.length;
		rcnt = right.length;
		
		while( i < lcnt && j < rcnt) {
			if(left[i] <= right[j]) {
				total[k] = left[i];
				i++;
			} else {
				total[k] = right[j];
				j++;
			} 
			k++;
		}
		
		while(i < lcnt) {
			total[k] = left[i];
			k++;
			i++;
		}
		
		while(j < rcnt) {
			total[k] = right[j];
			k++;
			j++;
		}
	}
}
