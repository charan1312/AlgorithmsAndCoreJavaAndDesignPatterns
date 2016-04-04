package edu.asu.foa.algo.controller;

import java.util.Arrays;

class Test1 {
   int i = 10;
}

class Test2 {
	int j = 10;
}
 
public class TestJava {
    public static void main(String args[]) {
      final Test1 t1 = new Test1();
      t1.i = 30;  // Works
      System.out.println(t1.i);
      
      Test2 t2 = new Test2();
      System.out.println(t2.j);
 
      Test1 t11 = new Test1();
      System.out.println(t11.i);
      
      t11 = t1;
      System.out.println(t11.i);
      
//      t1 = t11;
      
      Integer x = 128, y = 128;
      if (x == y)
         System.out.println("Same");
      else
         System.out.println("Not Same");
      
      int x1 = 400, y1 = 400;
      if (x1 == y1)
         System.out.println("Same");
      else
         System.out.println("Not Same");
      
      System.out.println(2+0+1+6+"GeeksforGeeks");
      System.out.println("GeeksforGeeks"+2+0+1+6);
      System.out.println(2+0+1+5+"GeeksforGeeks"+2+0+1+6);
      System.out.println(2+0+1+5+"GeeksforGeeks"+(2+0+1+6));
      
      int inarr1[] = {1, 2, 3};
      int inarr2[] = {1, 2, 3}; 
      Object[] arr1 = {inarr1};  // arr1 contains only one element
      Object[] arr2 = {inarr2};  // arr2 also contains only one element
      Object[] outarr1 = {arr1}; // outarr1 contains only one element
      Object[] outarr2 = {arr2}; // outarr2 also contains only one element        
      if (Arrays.deepEquals(outarr1, outarr2))
          System.out.println("Same");
      else
          System.out.println("Not same");
      
      final int tarr1[] = {1, 2, 3, 4, 5};
      int tarr2[] = {10, 20, 30, 40, 50};
      tarr2 = tarr1;      
//      tarr1 = tarr2;  
      for (int i = 0; i < arr2.length; i++)
         System.out.println(arr2[i]);    
      
    }
}