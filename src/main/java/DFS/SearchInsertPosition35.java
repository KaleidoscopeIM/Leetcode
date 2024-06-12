package DFS;

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int res = helper(nums, target, 0, nums.length - 1);
        return res < 0 ? 0 : res;
    }

    private int helper(int[] nums, int target, int start, int end) {
        if (start >= end) {
            if (nums[start] == target)
                return start;
            return target < start ? start - 1 : start + 1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target)
            return mid;
        if (target > nums[mid])
            return helper(nums, target, mid + 1, end);
        else return helper(nums, target, start, mid - 1);

    }
}
