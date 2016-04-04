package edu.asu.foa.algo.leetcode;

public class ClimbStairCase {
	
	public static void main(String[] args) {
		
		int n = 101;
		
		System.out.println(climbStairs(n));
	}

	static long climbStairs(int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		long out = 0;
		out = n%2 == 0 ? 2 : 1;
		int high2 = n%2 == 0 ? ((n/2) - 1) : n/2;	
		//System.out.println(high2);
		System.out.println("fact:"+ fact(50));
		System.out.println("fact:"+ fact(25));
		try{
			out = fact(high2) / ( fact(high2 - 2));
			System.out.println(out);
		} catch(Exception e) {
			System.out.println("Ex");
		}
		
		return out;	 
	}
	
	static long fact(int n) {
		long res = 1;
		for(int i=2; i<=n ;i++)
			res *= i;
		return res;
	}
	
	
	static int combination(int n, int k)
	{
	    return permutation(n) / (permutation(k) * permutation(n - k));
	}

	static int permutation(int i) {
	    if (i == 1) {
	        return 1;
	    }
	    return i * permutation(i - 1);
	}

}
