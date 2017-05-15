package edu.asu.foa.algo.controller;

public class Lprime {

    static int largestPrimeNumber(int[] numberArray) {
        int pnum = -1;
        for(int i=0;i < numberArray.length ;i++) {
            int c = 0;
            for(int j=2;j<numberArray[i];j++){
            	System.out.println(j+"----"+numberArray[i] + "-----------"+numberArray[i]/j);
                if(numberArray[i]%j == 0){
                    c = 1;
                    break;
                }
            }
            System.out.println("-:" + c);
            if(c == 0 && pnum < numberArray[i])
                pnum = numberArray[i];
        }
        return pnum;
    }

    public static void main(String[] args) {
		int [] a = new int[] {4,10};
    	System.out.println(largestPrimeNumber(a));
	}
}
/*

static String encodeString(String plaintext) {
    StringBuilder sb = new StringBuilder();
    for(char c : plaintext.toCharArray()) {
        if (c == ' ')
            sb.append("%20");
        else
            sb.append(c);
               
    }
    return sb.toString();
}


static boolean areCharactersUnique(String s) {
    
    boolean[] asciiCharSet = new boolean[256];
	for(int i=0; i < s.length(); i++) {
		int v = s.charAt(i);
		if(asciiCharSet[v]) 
			return false;
		asciiCharSet[v] = true;
	}
	return true;
}
*/