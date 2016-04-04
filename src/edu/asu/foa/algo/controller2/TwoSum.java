package edu.asu.foa.algo.controller2;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        
		int[] a = new int[2];
		
        int s = nums.length;
		for(int i = 0; i < s; i++) {
			for(int j = 0; j < s; j++) {
				if(i == j)
					continue;
				if(nums[i] + nums[j] == target) {
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
        
        return a;
        
    }

}
