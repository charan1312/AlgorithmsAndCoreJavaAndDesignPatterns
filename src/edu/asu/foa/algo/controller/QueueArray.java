package edu.asu.foa.algo.controller;

public class QueueArray {

	private int Q[];
	//	private int front;
	private int rear;
	private int size;
	//	private int len;

	public QueueArray(int n) {
		// TODO Auto-generated constructor stub
		size = n;
		//front = -1;
		rear = -1;
		//len = 0;
		Q = new int[size];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb =  new StringBuilder();
		for(int i=0; i<=rear; i++) {
			sb.append(Q[i] + " ");
		}
		return sb.toString();
	}
	public boolean isEmpty() {
		return rear == -1;
	}

	public boolean isFull() {
		return rear == (size - 1);
	}

	public int getsize() {
		return rear + 1;
	}

	public void enqueue(int val) throws Exception {
		if(isFull()) {
			throw new Exception();
		}
		Q[++rear] = val;
	}

	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception();
		}
		int res = Q[0];
		for(int i=0;i<rear;i++) {
			Q[i] = Q[i+1];
		}
		rear--;
		return res;
	}

	public static void main(String[] args) throws Exception {
		QueueArray qa= new QueueArray(4);
		qa.enqueue(32);
		qa.enqueue(12);
		qa.enqueue(2);
		System.out.println(qa);
		int a = qa.dequeue();
		System.out.println(a);
		System.out.println(qa);
	}
}

