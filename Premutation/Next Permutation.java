class Solution {
	public void nextPermutation(int[] nums){
		int lind = nums.length-1;
		for(int i = nums.length - 1; i > 0; i --)
		{
			if(nums[i]<=nums[i-1])
				lind = i-1;
			else
				break;
		}
		// reverse whole list
		if(lind == 0)
		{
			int lo = 0, hi = nums.length-1;
			while(lo < hi)
			{
				swap(nums,lo++,hi--);
			}
		}
		else
		{
			int rind = i + 1;
			while(rind+1 < nums.length && nums[rind+1] > nums[lind])
				rind++;
			swap(nums,lind,rind);
			int lo = lind+1, hi = nums.length-1;
			while(lo < hi)
			{
				swap(nums,lo++,hi--);
			}
		}
	}
	void swap(int[] nums,int lo, int hi)
	{
		int tmp = nums[lo];
		nums[lo] = nums[hi];
		nums[hi] = tmp;	
	}
}