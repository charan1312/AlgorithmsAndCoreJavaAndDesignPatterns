package edu.asu.foa.algo.visa.hackerrank;

public class InverseBinary {

	public static void main(String[] args) {

		int inp = 100;
		String s =  Integer.toBinaryString(inp);
		int out = convertInverseBinary(s);
		System.out.println(out);

		//System.out.println(Integer.parseInt("100083") / 25);
	}

	private static int convertInverseBinary(String s) {

		StringBuilder sb = new StringBuilder();

		for(char c : s.toCharArray()) {
			if(c=='0')
				sb.append('1');
			else
				sb.append('0');
		}

		return Integer.parseInt(sb.toString(),2);
	}
}
