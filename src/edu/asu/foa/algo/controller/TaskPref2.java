package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.omg.PortableServer.AdapterActivator;

public class TaskPref2 {

	public static int N = 10;
	public static int Level = -1;
	public static int nextLevel = 1;
	public static int temp,k;
	
	public static Map<Integer,Integer> TI = new HashMap<Integer,Integer>();
		
	public static int[] PR = {1,2,3,4,5,6,7,1,8,2,2,9};
	public static ArrayList<ArrayList<Integer>> ListofLevel = new ArrayList<ArrayList<Integer>>();
	public static Map<Integer,Integer> HM = new HashMap<Integer,Integer>();
	public static Map<Integer,Integer> TIMESHM = new HashMap<Integer,Integer>();
	public static Map<Integer,Integer> HM1 = new HashMap<Integer,Integer>();
	public static Set<Integer> NoPR = new HashSet<Integer>();
		
	
	public static void main(String[] args)
	{
		TI.put(1,10);TI.put(2,3);TI.put(3,2);TI.put(4,5);TI.put(5,6);TI.put(6,7);TI.put(7,8);TI.put(8,4);TI.put(9,2);TI.put(10,4);
		
		for(int i=0;i<PR.length;i = i+2)
		{
			HM.put(PR[i],PR[i+1]);
			NoPR.add(PR[i]);
			NoPR.add(PR[i+1]);
		}
	
		System.out.println("HM:" + HM);
		System.out.println("NoPR:" + NoPR);
		
		Level=Level+1;

		ListofLevel.add(new ArrayList<Integer>());
		ListofLevel.add(new ArrayList<Integer>());
		
		for(int i=1;i<=N;i++)
		{
			TIMESHM.put(i,0);
		}
		
		for(int i=1;i<=N;i++)
		{
			if(!NoPR.contains(i))
			{
			    ListofLevel.get(Level).add(i);
			    TIMESHM.put(i, TI.get(i));
			}
		}
		AddElemtoLevel(HM);
		System.out.println("LEvel Count:" + Level +  ListofLevel);

		int max = 0;
		
		for(int key : TIMESHM.keySet())
		{
			//System.out.println(key+"------------"+ TIMESHM.get(key));
			System.out.println(key+"------------"+ (TIMESHM.get(key) - TI.get(key)) + "----------" + TIMESHM.get(key) );
			if(max < TIMESHM.get(key))
				max = TIMESHM.get(key);
		}
		
		System.out.println("Max Time: " + max);
		
	}
	
	public static void AddElemtoLevel(Map<Integer,Integer> HM2)
	{
		Map<Integer,Integer> HM3 = new HashMap<Integer,Integer>();
		
		for(int i : HM2.keySet())
		{
			if(!HM2.containsValue(i))
			{
				ListofLevel.get(Level).add(i);
				TIMESHM.put(i, TIMESHM.get(i)+TI.get(i));
								
				if(!HM2.containsKey(HM2.get(i)))
				{
					ListofLevel.get(nextLevel).add(HM2.get(i));
					TIMESHM.put(HM2.get(i), TIMESHM.get(i) + TI.get(HM2.get(i)));
				}
				else 
				{
					TIMESHM.put(HM2.get(i), TIMESHM.get(i));
				}
			}
			else
			{
				HM3.put(i,HM2.get(i));
			}
		}
		
		System.out.println("LEvel Count:" + ListofLevel.size());
		System.out.println("HM3:" + HM3);
		if(!HM3.isEmpty())
		{
			ListofLevel.add(new ArrayList<Integer>());
			Level = Level + 1;
			nextLevel = nextLevel + 1;
			AddElemtoLevel(HM3);
		}
		else
			return;
	}
}
