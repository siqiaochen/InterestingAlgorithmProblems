### 31. Next Permutation

Next permutation is triggered by checking from back see how many numbers are already in reverse order and get 
index i for the first num not in reverse order. 
1. If there is no such number, reverse the whole list. 
2. If there is such order, swap the index i with the right side of array, find the right most index j that is bigger than it.
   - Swap i with j. 
   - Swap the right part of array.

Cases:<br />
   12345<br />
   321<br />
   2134<br />
   432331<br />
   1<br />
