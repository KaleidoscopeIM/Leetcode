package org.leetcode;

public class FindMinimumInRotatedSortedArray153 {
    public int findMin(int[] nums) {
        int mid = nums.length/2;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            if(start == end)
                return nums[start];
            if((end-start)==1)
                return Math.min(nums[start], nums[end]);
            if(nums[mid]< nums[mid+1] && nums[mid]<nums[mid-1])
                return nums[mid];
            if(nums[mid] > nums[end]) {
                start = mid + 1;
                mid = (start+end)/2;
            }else
                end = mid-1;
                mid = (start+end)/2;
            }
        return nums[0];
        }
}
