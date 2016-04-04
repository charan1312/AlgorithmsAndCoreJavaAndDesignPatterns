package edu.asu.foa.algo.controller;

import java.util.ArrayList;

public class MultiThreadingRunnableTest implements Runnable{
	
	private Integer j = 1;
	private ArrayList<Integer> ar = new ArrayList<Integer>();

	public MultiThreadingRunnableTest() {
		//super(s);
		ar.add(22);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Thread:" + Thread.currentThread().getName());
		for(int i=0;i<200;i++) {
			j = i;
			ar.add(i);
			System.out.println(Thread.currentThread().getName() + ":" +i + "  ---- J:" + j);
			if(Thread.currentThread().getName().equals("t2") && i == 27) {
				try{
					Thread.sleep(7000);
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		System.out.println("Ar Size:"+ ar.size());
		System.out.println(Thread.currentThread().getName() + ": J final:" + j);
	}
	
	
	public static void main(String[] args) {
		
		MultiThreadingRunnableTest m1 = new MultiThreadingRunnableTest();
		
		//MultiThreadingRunnableTest t2 = new MultiThreadingRunnableTest("t2");
		Thread t1 = new Thread(m1,"t1");
		Thread t2 = new Thread(m1,"t2");
		t1.start();
		t2.start();
		
		//t1.start();  --- CANT Call start() TWICE---- U VL GET java.lang.IllegalThreadStateException
		
		
		
		//t1.run();   //CALLING THE RUN METHOD KILLS THE PURPOSE OF THREADS>>> NEW CALL STACKS ARE NT CREATED
		//t2.run();     //            ALSO THEY RUN ONE AFTER OTHER AS A METHOD INVOCATION
		
	}
}
