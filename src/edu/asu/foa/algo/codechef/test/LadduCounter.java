package edu.asu.foa.algo.codechef.test;

import java.util.Scanner;

public class LadduCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalTestCases = sc.nextInt();
		int[] ans = new int[totalTestCases];
		int tCount = 1; 
		sc.nextLine();
		while (tCount <= totalTestCases) {
			ans[tCount] = 0;
			String outerLine = sc.nextLine();
			String[] args0 = outerLine.split(" ");
			int noOfActivities = Integer.parseInt(args0[0]);
			String origin = args0[1];
			int actCount = 1;
			while(actCount <= noOfActivities) {
				String line = sc.nextLine();
				if(line.contains("CONTEST_WON")) {
					String[] args1 = line.split(" ");
					ans[tCount] += ( 300 + 20 - (Integer.parseInt(args1[1]) > 20 ? 0 : Integer.parseInt(args1[1])) );
				} else if (line.contains("TOP_CONTRIBUTOR")) {
					ans[tCount] += 300;
				} else if (line.contains("BUG_FOUND")) {
					String[] args2 = line.split(" ");
					ans[tCount] += Integer.parseInt(args2[1]);
				} else if (line.contains("CONTEST_HOSTED")) {
					ans[tCount] += 50;
				} else {
					
				}
				actCount++;
			}
			if(origin.contains("NON_INDIANS")) {
				ans[tCount]/= 400;
			} else {
				ans[tCount]/= 200;
			}
			System.out.println(ans[tCount]);
			tCount++;
		}
	}
}
