package edu.asu.foa.algo.controller;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank {

    
/*    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        for(int i=0; i<lines; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int k=0;k<n;k++) {
                System.out.print((int)(a + (int) Math.pow(2,k) * b));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
*/
  public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
/*    int t=Integer.parseInt(args[0]);//sc.nextInt();

    for(int i=1;i<=t;i++)
    {
        try
        {
            long x=Long.parseLong(args[i]);
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");
            //Complete the code
            long shortr= (long)Math.pow(2,15);
            long intr= (long)Math.pow(2,31);
            long longr= (long)Math.pow(2,63);
            if(x>=-(shortr) && x<= shortr-1)System.out.println("* short");
            if(x>=-(intr) && x<= intr-1)System.out.println("* int");
            if(x>=-(longr) && x<= longr-1)System.out.println("* long");
            else
                throw new java.lang.Exception();                
        }
        catch(Exception e)
        {
            System.out.println(args[i]+" can't be fitted anywhere.");
        }

    }
*/

	  
/*	        int a[][] = new int[6][6];
	        a[0][0] = 1;a[0][1] = 1;a[0][2] = 1;a[0][3] = 0;a[0][4] = 0;a[0][5] = 0;
	        a[1][0] = 0;a[1][1] = 1;a[1][2] = 0;a[1][3] = 0;a[1][4] = 0;a[1][5] = 0;
	        a[2][0] = 1;a[2][1] = 1;a[2][2] = 1;a[2][3] = 0;a[2][4] = 0;a[2][5] = 0;
	        a[3][0] = 0;a[3][1] = 9;a[3][2] = 2;a[3][3] = -4;a[3][4] = -4;a[3][5] = 0;
	        a[4][0] = 0;a[4][1] = 0;a[4][2] = 0;a[4][3] = -2;a[4][4] = 0;a[4][5] = 0;
	        a[5][0] = 0;a[5][1] = 0;a[5][2] = -1;a[5][3] = -2;a[5][4] = -4;a[5][5] = 0;
	        
	        
	        int sum=Integer.MIN_VALUE,sumt;
	        for(int i=0; i < 4; i++){
	            for(int j=0; j < 4; j++){
	            	System.out.print(i +" ***** " + j +" ***** ");
	                sumt=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
	                //System.out.println(sumt);
	                if(sumt > sum)
	                    sum = sumt;
	                //System.out.println(sum);
	            }
	        }
	        System.out.println(sum);
*/
	  int N = 4;
      String[] s = new String[N];
      //in.nextLine();
      //for(int i=0; i< N;i++)
      //    s[i] = in.nextLine();
      s[0]="aba";
      s[1] = "baba";
      s[2] = "aba";
      s[3] = "xzxb";
      int Q = 3;//in.nextInt();
      String[] q = new String[Q];
      int[] c = new int[Q];
      System.out.println(c[0]);
      //in.nextLine();
      q[0]="aba";
      q[1] = "xzxb";
      q[2] ="ab";
      for(int i=0; i<Q;i++) {
          //q[i] = in.nextLine();
          for(int j = 0 ;j<N;j++) {
              if (s[j] == q[i]) {
                  System.out.println("Maych");
            	  c[i]++;
              }
          }
          System.out.println(c[i]);
      }
	  
  }
}
