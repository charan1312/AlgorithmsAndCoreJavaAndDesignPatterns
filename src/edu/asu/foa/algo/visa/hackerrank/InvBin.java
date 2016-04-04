package edu.asu.foa.algo.visa.hackerrank;

public class InvBin {

	
	public static void main(String[] args) {
		
		int inp = 50;
		//getReverseBin(inp);
		String s = Integer.toBinaryString(inp);
		System.out.println(s);
		int out = getReverseBinFromString(s);
		System.out.println("ANS:" + out);
		
	}

	private static int getReverseBinFromString(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray())
			if(c=='1')
				sb.append('0');
			else
				sb.append('1');
		//System.out.println(sb.toString());
		return Integer.parseInt(sb.toString(), 2);
	}

	private static int getReverseBin(int inp) {
		int n = inp;
		//System.out.println(Integer.parseInt("100",2));
		StringBuilder sb = new StringBuilder();
		StringBuilder sbo = new StringBuilder();
		while(n>0) {
			System.out.println(n);
			int v = n%2;
			sbo.append(v);
			if(v==1)
				sb.append(0);
			else
				sb.append(1);
			n = n/2;
		}
		System.out.println("Bfr sbo:" + sbo.toString());
		System.out.println("Bfr sb:" + sb.toString());
		sb.reverse();
		System.out.println("Aft sb:" + sb.toString());
		
		System.out.println("VAL:" + Integer.parseInt(sb.toString(),2));
		//char[] inparr = Integer.parseInt(inp.t, 2);
				
		return 0;
	}
	
}
