package edu.asu.foa.algo.geekforgeeks;

public class SquareRootOfNum {

	public static void main(String[] args) {
		
		int a = 525;
		
		int sqrt = squareRootBigON(a);
		
		int sqrtb = squareRootUsingBinarySearch(a);
		
		//System.out.println(23*23);
		System.out.println(sqrtb);
		
	}

	private static int squareRootUsingBinarySearch(int a) {
		int first = 0, last = a, ans = 0;
		int mid = (first+last) / 2;
		int pass = 0;
		while(first <= last){
			pass++;
			if(mid*mid == a)
				return mid;
			else if(mid*mid < a){
				first = mid + 1;
				ans = mid;
			} else {
				last = mid - 1;
			}
				
			mid = (first + last) / 2;
		}
		System.out.println("PAsses: " + pass);
		return ans;
	}

	private static int squareRootBigON(int a) {
		
		if(a == 0 || a == 1)
			return a ;
		
		int i = 1;
		
		while(i*i <= a) {
			if(i*i == a)
				return i;
			else
				i++;
			System.out.println(i);
		}
		
		return i-1;
	}
}
