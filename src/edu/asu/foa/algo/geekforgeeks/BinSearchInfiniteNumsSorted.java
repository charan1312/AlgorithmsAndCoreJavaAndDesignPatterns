package edu.asu.foa.algo.geekforgeeks;

import edu.asu.foa.algo.controller.BinarySearchTreeDemo;

public class BinSearchInfiniteNumsSorted {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,22,33,343,456,565,567,4544,4565,5657,6767,6878,7887,78676,456454,4565464,34232421};
		
		searchInInfiniteNum(arr, 78676);
		
		//System.out.println(arr[9]);
	}

	private static void searchInInfiniteNum(int[] arr, int key) {

		int left = 0 , right = 1;
		int val = arr[0];
		
		while(val < key) {
			left = right ;
			right = right * 2;
			System.out.println(right);
			if(right > arr.length) {
				val = arr[arr.length - 1];
				right = arr.length - 1;
			}
			else
				val = arr[right];
		}
		
		System.out.println(binarySearch(arr,left,right,key));		
	}

	private static int binarySearch(int[] a, int l, int r, int v) {
		int first = l;
		int last = r ;
		int val = v;
		int mid = (first + last) / 2 ;
		//System.out.println("First Mid:" + mid);
		
		if(last >= first) {
			System.out.println("First:" + first + " Last:" + last + " Mid:" + mid);
			if(val == a[mid]) {
				return mid;
			} else if(val > a[mid]) {
				return binarySearch(a, mid + 1, last, val);
			} else {
				return binarySearch(a, first , mid - 1, val);
			}
		}
		return -1;
	}
	
	
}
