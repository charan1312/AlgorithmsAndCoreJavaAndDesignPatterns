package edu.asu.foa.algo.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	
	private String message;
	
	public WorkerThread(String s) {
		// TODO Auto-generated constructor stub
		this.message = s;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "Start message:" + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + "End");
	}
	
	private void processMessage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 10 ; i++) {
			Runnable worker = new WorkerThread("Msg" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finished all threads");
	}	
}
