### Binary Search

Templete

```java
    private int bSearch(int[] nums, int target)
    {
        int lo = 0, hi = nums.length;
        while(lo<=hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] > target)
                hi = mid - 1;
            else if(nums[mid] < target)
                lo = mid + 1;
			else 
		return mid;
        }
        return -1;
    }
    private int bSearchFloor(int[] nums, int target)
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
    private int bSearchCeiling(int[] nums, int target)
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
```
