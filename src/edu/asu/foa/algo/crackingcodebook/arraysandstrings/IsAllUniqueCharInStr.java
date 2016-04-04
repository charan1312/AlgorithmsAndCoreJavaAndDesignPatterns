package edu.asu.foa.algo.crackingcodebook.arraysandstrings;

public class IsAllUniqueCharInStr {


	public static void main(String[] args) {

		String a = "kjsfhusahfskjd";
		boolean flag = isAllUniq(a);
		System.out.println(flag);
	}

	static boolean isAllUniq(String s) {
		boolean[] asciiCharSet = new boolean[256];
		for(int i=0; i < s.length(); i++) {
			int v = s.charAt(i);
			if(asciiCharSet[v]) 
				return false;
			asciiCharSet[v] = true;
		}
		return true;
	}
}
