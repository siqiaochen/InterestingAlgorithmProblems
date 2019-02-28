### 4. Median of Two Sorted Arrays
This is not that hard. We can use devide and conquer. First, split the k to k/2. Then, compare num1[k/2] and num2[k/2]. 
If num1[k/2] > num2[k/2] then the answer is not going to be in num2[0..k/2]. Vice versa.
2 [3] 4 5
1 [2] 3
Just remember to check the following status:

1. what if num1's length is smaller than k/2
   - Just check num2
2. what if k == 1
   - Compare and return the less of num1[0] num2[0]
3. what if nums1[k/2] == nums2[k/2]
   - must remember that we can not directly return num1[k/2] since k could odd number and k/2 + k/2 is less than k. We must compare rest of cases.
