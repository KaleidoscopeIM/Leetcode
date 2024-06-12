package org.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1)
            return true;
        for(int i=0;i<nums.length;++i){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
//        Set<Integer> set = new HashSet<>();
//        for(int n: nums){
//            if(set.contains(n))
//                return false;
//            else
//                set.add(n);
//        }
//        return true;
    }
}
