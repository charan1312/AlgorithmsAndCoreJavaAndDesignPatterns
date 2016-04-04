package edu.asu.foa.algo.controller;

import java.util.Arrays;

import edu.asu.foa.algo.crackingcodebook.CrackingCodeBookInterface;

public class CrackingCodeBookImpl implements CrackingCodeBookInterface {

	@Override
	public boolean hasUniqueCharactersWithAsciiCharset(String s) {
		// TODO Auto-generated method stub
		boolean[] asciiCharSet = new boolean[256];
		for(int i=0; i < s.length(); i++) {
			int v = s.charAt(i);
			if(asciiCharSet[v]) 
				return false;
			asciiCharSet[v] = true;
		}
		return true;
	}
	
	public static String sortString(String s) {
		char[] cseq = s.toCharArray();
		Arrays.sort(cseq);
		String ans = new String(cseq);
		return ans;
	}

	@Override
	public boolean hasUniqueCharactersWithStringSort(String s) {
		// TODO Auto-generated method stub
		String ss = sortString(s);
		try{
			for(int i=0; i<s.length(); i++) {
				if (ss.charAt(i) == ss.charAt(i+1))
					return false;	
			}
		} catch(StringIndexOutOfBoundsException e) {
			
		}
		return true;
	}

	@Override
	public boolean hasUniqueCharactersWithCheckEachChar(String s) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < s.length() ; i++) {
			for(int j = 0; j < s.length() ; j++) {
				//System.out.println(s.charAt(i) + "----" +s.charAt(j));
				if(i==j)
					continue;
				if(s.charAt(i) == s.charAt(j)) 
					return false;
			}
		}
		return true;
	}

	public String removeDuplicateCharsInString(String s) {
		// TODO Auto-generated method stub
		StringBuilder res = new StringBuilder();
		res.append(s.charAt(0));
		for(int i = 1; i < s.length() ; i++) {
			boolean flag = true;
			for(int j = 0; j < res.length() ; j++) {
				if (s.charAt(i) == res.charAt(j))
					flag = false;
			}
			if(flag)
				res.append(s.charAt(i));
		}
		return res.toString();
	}

	@SuppressWarnings("null")
	@Override
	public String[] listLargestSmallestSubArraysVowelAndCon(String s) {
		// TODO Auto-generated method stub
		String largest = null;
		String smallest = null;
		String[] res = new String[2];
		
		int i = leastIndexofVowel(s);
		int j = highestIndexofConsonant(s);
		
		if(i == -1 || j == -1)  {
			largest = null;
			smallest = null;
			return null;
		}
		System.out.println(i + " ----------------- " + j + "===="+ s);
		largest = s.substring(i, j + 1);
		res[0] = largest;
		res[1] = smallest;
		return res;
	}
	
	public static int leastIndexofVowel(String s) {
		for(int i = 0; i < s.length() ; i++) {
			if ( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				System.out.println("First Vowel:" +i);
				return i;
			}
		}
		return -1;
	}
	
	public static int highestIndexofConsonant(String s) {
		for(int i = s.length() - 1; i >= 0 ; i--) {
			if ( !(s.charAt(i) == 'a') && !(s.charAt(i) == 'e') && !(s.charAt(i) == 'i') && !(s.charAt(i) == 'o') && !(s.charAt(i) == 'u') ) {
				System.out.println("Last Consonant:" + i);
				return i;
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		CrackingCodeBookImpl ccimpl = new CrackingCodeBookImpl();
		String s = "ajsrcklgdd";
		String sortedS= sortString(s);
		System.out.println(sortedS);
		boolean res = ccimpl.hasUniqueCharactersWithAsciiCharset(s);
		System.out.println(res);
		res = ccimpl.hasUniqueCharactersWithStringSort(s);
		System.out.println(res);
		res = ccimpl.hasUniqueCharactersWithCheckEachChar(s);
		System.out.println(res);
		String sWithDup = "slkjklssdkhksjfusfsdsd";
		String sWithoutDup = ccimpl.removeDuplicateCharsInString(sWithDup);
		System.out.println(sWithoutDup);
		
		String[] ls = ccimpl.listLargestSmallestSubArraysVowelAndCon("aaaabbbbbbddddddddwwwwwwwbbbbbcccccccaaeeeaaaaaa");
		
		for(String l : ls)
			System.out.print(l +"   ");
		//int[] intarr = new int[] {43,2,232,2,23,2};
		//Arrays.sort(intarr);             //INLINE SORTING-- I MEAN THE ORIGINAL intarr IS BEING OVERWRITTEN IN THE ASC ORDER
		//for (int j=0;j<intarr.length;j++)
		//	System.out.print(intarr[j] + "  ");
	}
}
