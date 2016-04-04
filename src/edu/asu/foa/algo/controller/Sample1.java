package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class MyThread extends Thread {
//
//	public static int x;
//	
//    public void run(int a ,int b){
//		x=a;
//		x=x+b;
//		System.out.println(x);
//	}
//  }

public class Sample1 {

	public static void main(String[] args) {
		/*
		int j = 0;
		for(int i=0;i<10;i++){
			j=j++;
			System.out.println("INSIDE: " + j);
		}
		System.out.println(j);
		*/
		
		List<String> cars = new ArrayList<String>(Arrays.asList("BMW","Honda Accord"));
		
		System.out.println(cars);
		System.out.println(cars.toString());
		System.out.println(cars.toArray());
		
		cars.add(1,"Mustang");
		cars.add("Audi");
		
		System.out.println(cars);
	
		cars.addAll(Arrays.asList("Merc","Ferrari"));
		
		//cars.addAll( new String[] {"Merc","Ferrari"});
		System.out.println(cars);
		
	}
}
