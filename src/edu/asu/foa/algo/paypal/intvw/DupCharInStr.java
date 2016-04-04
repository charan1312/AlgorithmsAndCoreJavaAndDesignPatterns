package edu.asu.foa.algo.paypal.intvw;

public class DupCharInStr {

	public static void main(String[] args) {
		String s = "acsdkZZlnnfdlkfnAAaldl";
		char[] c = s.toCharArray();
		int[] asc = new int[52];
		for(int i = 0 ; i < s.length(); i++) {
			if(c[i] >='A' && c[i] <= 'Z')
				asc[(c[i] - 65)] += 1;
			if(c[i] >='a' && c[i] <= 'z')
				asc[(c[i] - 97 + 26)] += 1;
			else
				continue;
		}

		//System.out.println(asc.length);
		for(int i = 0 ; i < asc.length; i++) {
			//System.out.print(asc[i]);
			if(asc[i]>1 && i<26)
				System.out.println((char)(i + 65));
			
			if(asc[i]>1 && i>=26 && i<=52)
				System.out.println((char)(i + 97 - 26));

		}
	}
}
