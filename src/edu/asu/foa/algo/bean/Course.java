package edu.asu.foa.algo.bean;
import edu.asu.foa.algo.constant.Constant;

import java.awt.peer.TextAreaPeer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course {

	private int cid;
	private int[] TAPref;
	public Queue<Integer> TAPrefofC; // = new Queue<Integer>();
	public List<Integer> TAPrefofCforA2;
	public List<Integer> TPrefofCforA1 = new ArrayList<Integer>();      //PUT THESE IN THE CONSTRUCTORS
	public List<Integer> TPrefofCforA1List = new ArrayList<Integer>();
	public int assignedTA = -1;
	public int index = 0;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int[] getTAPref() {
		int[] taPref = new int[this.TAPref.length];
		System.arraycopy(this.TAPref,0,taPref,0,taPref.length); // use System.arraycopy to set an array of elements
		return taPref;
	}
	public void setTAPref(int[] taPref) {
		this.TAPref = new int[Constant.N];
		System.arraycopy(taPref,0,this.TAPref,0,Constant.N);
	}
	
	public Course()
	{
		TAPrefofC = new LinkedList<Integer>();
		TAPrefofCforA2 = new LinkedList<Integer>();
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		Queue<Integer> Clist = new LinkedList<Integer>();
		
		int[] c1Prefs = {1,5,3,2,4};
		Course C1 = new Course();
		C1.setCid(1);
		
		// This is ONE way of setting an array of elements - 
		//					Using a local array of elements - pass it to System.arraycopy
		C1.setTAPref(c1Prefs);
		
		// The SECOND way to send an array of elements DIRECTLY as a parameter to int[] method
		C1.setTAPref(Arrays.copyOf(new int[] {1,5,3,2,4}, Constant.N));
		
		//C1.setTAPref(Arrays.asList(new int[] {1,5,3,2,4}));  - This statement is invalid
		
		
		//Adding the elements into the QUEUE one-by-one
		C1.TAPrefofC.add(1);C1.TAPrefofC.add(5);C1.TAPrefofC.add(3);C1.TAPrefofC.add(2);C1.TAPrefofC.add(4);
		Clist.add(C1.getCid());		

		//Adding all the elements into the QUEUE at ONCE
		C1.TAPrefofC.addAll(Arrays.asList(new Integer[] {1,5,3,2,4}));
		
		System.out.println("TOP ELEMENT IN THE QUEUE:" + C1.TAPrefofC.peek());
	}	
		
}


