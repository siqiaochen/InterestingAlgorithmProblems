class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[] {-1,-1};
        int left = bFloor(nums,target);
        if(left >= nums.length || nums[left] != target) return ans;
        int right = bCeiling(nums,target);
        ans[0] = left;
        ans[1] = right-1;
        return ans;
    }
    private int bFloor(int[] nums, int target)
    {
        int lo = 0, hi = nums.length;
        while(lo<hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] >= target)
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }
    private int bCeiling(int[] nums, int target)
    {
        int lo = 0, hi = nums.length;
        while(lo<hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] > target)
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }
}