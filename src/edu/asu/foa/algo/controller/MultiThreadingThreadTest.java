package edu.asu.foa.algo.controller;

public class MultiThreadingThreadTest extends Thread{
	
	private int j = 1;
	
	public MultiThreadingThreadTest(String s) {
		super(s); 
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Thread:" + this.getName());
		for(int i=0;i<1000;i++) {
			j = i;
			System.out.println(this.getName() + " --:" +i + "---J:" + j);
		}
	}
	
	
	public static void main(String[] args) {
		
		MultiThreadingThreadTest t1 = new MultiThreadingThreadTest("t1");
		
		MultiThreadingThreadTest t2 = new MultiThreadingThreadTest("t2");
		MultiThreadingThreadTest t3 = new MultiThreadingThreadTest("t3");
		
		t1.start();
		t2.start();
		try {
			//t1.join();          //if we comment out this join block then dfsdfsfs will print first -- I mean this main thread that spawned two thread also rum parallely along with them
			//t2.join();          // but if use this block,  dfsdfsfs will come last -  coz the main thread waits for the two threads to finish
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("dfsdfsfs");
		//t2.start();
		//t3.start();
		
	}
}
