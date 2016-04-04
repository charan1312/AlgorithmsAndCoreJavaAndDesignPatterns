package edu.asu.foa.algo.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KruskalData {

	public static int N;

	public static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(); 
	
	public static HashMap<Integer,Integer> Findset =  new HashMap<Integer,Integer>(); 
		
	public static ArrayList<Integer> MakeSet = new ArrayList<Integer>();
	
	public static void main(String args[])
	{
		
		//ADJACENCY LIST	
		adjList.add(new ArrayList<Integer>());
		adjList.get(0).add(1);adjList.get(0).add(2);adjList.get(0).add(3);
		adjList.add(new ArrayList<Integer>());
		adjList.get(1).add(0);adjList.get(1).add(2);adjList.get(1).add(3);
		adjList.add(new ArrayList<Integer>());
		adjList.get(2).add(0);adjList.get(2).add(1);adjList.get(2).add(3);
		adjList.add(new ArrayList<Integer>());
		adjList.get(3).add(0);adjList.get(3).add(1);adjList.get(3).add(2);
		adjList.add(new ArrayList<Integer>());
		adjList.get(4).add(5);
		adjList.add(new ArrayList<Integer>());
		adjList.get(5).add(4);
		
		//MAKE_SET	&& FIND SET
		for (int i=0;i<N;i++)
		{
			MakeSet.add(i);        //MakeSet.add(1);MakeSet.add(2);MakeSet.add(3);MakeSet.add(4);MakeSet.add(5);
			Findset.put(i, i);
		}
		
		//Edges List
		
		
		
		
	}


}
	
