package edu.asu.foa.algo.paypal.intvw;

public class NumberIndexEqual {

	int a[];
	int binA[];
		
	public NumberIndexEqual() {
		// TODO Auto-generated constructor stub
		a = new int[] {1,1,1,3,3,5,5,7,7,8,8,9,11,13,13,13,18,18,18,18,18,22,22,22,22,22,22,22};
		binA = new int[] {0,1,2,3,4,8,9,11,13,18,23,45,122,222,322,422};
	}
	
	static void printSameIndexNum(int[] a) {
		//System.out.println("nside");
		int len = a.length;
		for (int i = 0; i < len ; i++) {
			if(a[i] == i) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		NumberIndexEqual n = new NumberIndexEqual();
//		System.out.println("Len:" + n.a.length);
//		printSameIndexNum(n.a);
		
		printSameIndexSortedNumUsingBinSearchTechn(n.binA,0,n.binA.length - 1);
		
/*		int index = binarySearch(n.binA, 422);
		System.out.println("Index where val present(using normal bin) is:" + index);
		
		int index1 = binarySearchRecursive(n.binA, 0, n.binA.length-1, 422);
		System.out.println("Index where val present is(using recursive):" + index1);
*/
	}
	
	static void printSameIndexSortedNumUsingBinSearchTechn(int[] a, int first, int last) {
			int mid = (first + last) / 2 ;
			int pass = 0;
			while(first <= last) {
				pass++;
				if(mid == a[mid]) {
					System.out.println("Passes =" + pass);
					System.out.println(mid);
					printSameIndexSortedNumUsingBinSearchTechn(a,first,mid-1);
					printSameIndexSortedNumUsingBinSearchTechn(a,mid+1,last);
					break;
				} else if(mid > a[mid]) {
					first = mid + 1;
				} else {
					last = mid - 1;
				}
				mid = (first + last) / 2 ;
			}
			//System.out.println("Passes =" + pass);
	}
	
	static int binarySearch(int[] a, int val ) {
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2 ;
		System.out.println("First Mid:" + mid);
		
		while(first <= last) {
			System.out.println("First:" + first + " Last:" + last + " Mid:" + mid);
			if(val == a[mid]) {
				return mid;
			} else if(val > a[mid]) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			
			mid = (first+last) / 2 ;
			//System.out.println(" Mid in loop:" + mid);
		}
		return -1;
	}
	
	static int binarySearchRecursive(int[] a, int l, int r, int v) {
		
		int first = l;
		int last = r ;
		int val = v;
		int mid = (first + last) / 2 ;
		System.out.println("First Mid:" + mid);
		
		if(last >= first) {
			System.out.println("First:" + first + " Last:" + last + " Mid:" + mid);
			if(val == a[mid]) {
				return mid;
			} else if(val > a[mid]) {
				return binarySearchRecursive(a, mid + 1, last, val);
			} else {
				return binarySearchRecursive(a, first , mid - 1, val);
			}
		}
		return -1;
	}
	
}
