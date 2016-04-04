package edu.asu.foa.algo.leetcode;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] nums = new int[] { 2,4,42,21,32,423,432,43,4232,234,312,315,4235,54,45,4131};
		
		System.out.println(containsDuplicateHM(nums));
	}

	static boolean containsDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length - 1; i++) {
			if(nums[i] == nums[i+1])
				return true;
		}
		return false;
	}
	
	static boolean containsDuplicateHM(int[] nums) {
		// TODO Auto-generated method stub
		
		//Inet4Address a = new Inet4Address(1.23.3.1);
		
		Map<Integer, Integer> n = new HashMap<Integer,Integer>();
		
		for(int i : nums) {
			if(n.containsKey(i))
				return true;
			else
				n.put(i, 1);
		}
		return false;
	}
	
}
