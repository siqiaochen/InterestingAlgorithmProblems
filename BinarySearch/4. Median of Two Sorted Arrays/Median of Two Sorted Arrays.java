class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int k = nums1.length + nums2.length;
    if(k % 2 == 1)        
      return findMedian(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (k+1) /2); 
    return 
      (findMedian(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, k / 2) + 
       findMedian(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, k / 2 + 1))/2.0;
  }
  double findMedian(int[] nums1, int lo1, int hi1, int[] nums2, int lo2, int hi2, int k)
  {
    if(lo1 > hi1) return nums2[k+lo2-1];
    if(lo2 > hi2) return nums1[k+lo1-1];   
    if(k == 1) 
      return nums1[lo1] < nums2[lo2] ? nums1[lo1] : nums2[lo2];  
    int km = k / 2;
    if(hi1 - lo1 < km - 1)   
      return findMedian(nums1, lo1, hi1, nums2, lo2 + km, hi2, k - km); 
    else if(hi2 - lo2 < km - 1)        
      return findMedian(nums1, lo1 + km, hi1, nums2, lo2, hi2, k - km);   
    if(nums1[lo1 + km - 1] < nums2[lo2 + km - 1])  
      return findMedian(nums1, lo1 + km , hi1, nums2, lo2, hi2, k - km);
    return findMedian(nums1, lo1 , hi1, nums2, lo2 + km, hi2, k - km);     
  }
}
