package edu.asu.foa.algo.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TA {

	private int TAId;
	public List<Integer> CPrefofTA;
	public List<Integer> CPrefofTAforA1 = new ArrayList<Integer>();
	public List<Integer> CPrefofTAforA1List = new ArrayList<Integer>();
	
	public int assignedCourse = -1; 
	
	public int getTAId() {
		return TAId;
	}

	public void setTAId(int tAId) {
		TAId = tAId;
	}

	public List<Integer> getCPrefofTA() {
		return CPrefofTA;		// sending the reference and allocating the same ref to private var-- NOT COOL
	}

	public void setCPrefofTA(List<Integer> cPrefofTA) {
		CPrefofTA = cPrefofTA;	// sending the reference and allocating the same ref to private var-- NOT COOL
	}

	public TA()
	{
		CPrefofTA = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		TA ta1 = new TA();

		// This is to send an array of elements as a LIST - can be sent as a SINGLE parameter
		Arrays.asList(new Integer[] {1, 2, 3});
		
		// Can we send a LIST of ELEs as a PARAMETER directly to setter method?  --  Answer is YES -- see above lines
		ta1.setCPrefofTA(Arrays.asList(new Integer[] {1,2,3,4,5}));   
		
		//Method to add the elements to the LIST one-by-one using add
		ta1.CPrefofTA.add(5);ta1.CPrefofTA.add(4);ta1.CPrefofTA.add(1);ta1.CPrefofTA.add(2);ta1.CPrefofTA.add(3);
	
		//Method to add all the elements to the LIST at ONCE using addAll
		ta1.CPrefofTA.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
	}
	
}
