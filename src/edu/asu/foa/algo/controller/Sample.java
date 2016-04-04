package edu.asu.foa.algo.controller;

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

public class Sample {

	public static int x;

	public static void add(int a ,int b){
		x=a;
		x=x+b;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Thread thread =  new Thread(){
		public void run(){
				add(0,1);
				add(2,3);
			}
		};
		thread.start();
	}
}
