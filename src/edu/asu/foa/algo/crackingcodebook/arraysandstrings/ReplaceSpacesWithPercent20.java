package edu.asu.foa.algo.crackingcodebook.arraysandstrings;

public class ReplaceSpacesWithPercent20 {

	public static void main(String[] args) {
		
		String s = "Mr John Smith";
		
		//System.out.println(s.replace(" ", "%20"));
		
		String snew = replaceSpacesWithPercent20(s);
		
		System.out.println(snew);
	}

	private static String replaceSpacesWithPercent20(String s) {
		
		int len = s.length(), newlen = 0;
		int k = 0, nspaces = 0;
		char[] carr = new char[1000];
		
		for(char c :s.toCharArray()) {
			carr[k] = c;
			if(carr[k] == ' ')
				nspaces++;
			k++;
		}
		
		newlen = len + nspaces * 2 ;
		
		carr[newlen] = '\0';
		for(int i = len - 1 ; i >= 0; i-- ) {
			if(carr[i] == ' ') {
				carr[newlen - 1] = '0';
				carr[newlen - 2] = '2';
				carr[newlen - 3] = '%';
				newlen -= 3;
			} else {
				carr[newlen - 1] = carr[i];
				newlen = newlen - 1;
			}
		}
				
		
		return new String(carr);
	}

	private static String replaceSpacesWithPercent20WithShift(String s) {   // NOT SO EFFICENT- aS it invOLVES Lots of SHiftiNg
		
		//StringBuilder sb = new StringBuilder();
		int len = s.length();
		int k = 0;
		char[] carr = new char[1000];
		
		//carr = s.toCharArray() ;                  ITS Adding \0 at the end of the copied characters thus making the length of carr to to s.length
		
		for(char c :s.toCharArray()) {
			carr[k] = c;
			k++;
		}
		
		//System.out.println(carr[15] + " " + carr[16] + " " + carr[17]);
		int i = 0;
		while(i <= len - 1) {
			if(carr[i] == ' ') {
				for(int j = len - 1 ; j > i ; j--) {
					carr[j + 2] = carr[j];
				}
				carr[i] = '%';
				carr[i+1] = '2';
				carr[i+2] = '0';
				len = len + 2;
			}
			i++;
		}
		
		return new String(carr);
	}
}
