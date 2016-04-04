package edu.asu.foa.algo.leetcode;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = 10;
		printFibForN(n);
	
		System.out.println("By Range:");
		int r = 192;
		printFibByRange(r);
		System.out.println();
		System.out.println("By Rec:");
		
		for( int i=0; i<10; i++) {
			System.out.print(printFibByRec(i));
			System.out.print(' ');
		}
		
	}

	private static int printFibByRec(int i) {
		if(i==1 || i==0) {
			//System.out.print(i); 
			//System.out.print(' ');
			return i;
		}
		else {
			//System.out.print(printFibByRec(i-1) + printFibByRec(i-2));
			//System.out.print(' ');
			return printFibByRec(i-1) + printFibByRec(i-2);
		}
		//return i;
	}

	private static void printFibByRange(int r) {
		int a=1,b=1,c=a+b;
		System.out.print(a);System.out.print(' ');
		System.out.print(b);System.out.print(' ');
		while(c<=r) {
			System.out.print(c);System.out.print(' ');
			a = b;
			b = c;
			c = a + b;
		}
	}

	private static void printFibForN(int n) {
		int k = 2,c; 
		int a = 1;
		System.out.print(a);
		System.out.print(' ');
		int b = 1;
		System.out.print(b);	
		System.out.print(' ');
		while(k<=n) {
			c = a + b;
			System.out.print(c);
			System.out.print(' ');
			a = b;
			b = c;
			k++;
		}
		
	}

}
