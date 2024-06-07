package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxNumOfPairs {

	public static void main(String[] args) {
		
		int input[] = {1,2,3,1,3,2,2,4,3,3,5,6,5};
		
		int output[] = numberOfPairs(input);
		for(int i:output)
			System.out.println(i);
	}
	
	public static int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
			/*
			 * if(hm.containsKey(nums[i])){ int k = hm.get(nums[i]); hm.put(nums[i],k+1); }
			 * else{ hm.put(nums[i],1); }
			 */
        	hm.putIfAbsent(nums[i], 0);
        	hm.put(nums[i], hm.get(nums[i])+1);
            
        }
    
        
        List<Integer> listKeys = new ArrayList<Integer>(hm.values());
        
        int leftOuts = 0;
        int pairs = 0;
        for(int i=0;i<listKeys.size();i++){
            if(listKeys.get(i)%2 != 0){
                leftOuts++;
            }
            
            pairs += listKeys.get(i)/2;
            
        }
        
        int[] ans = {pairs,leftOuts};
        
        return ans;
    }

}
