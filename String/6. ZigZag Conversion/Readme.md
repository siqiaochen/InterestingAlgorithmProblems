### 6. ZigZag Conversion
This prblem is not hard to do if you picked the right index to start with. Clearly, we can see that the  distance between chars in top row is NumRows * 2 - 2. And the chars in next row is index the char in previous row + 1 or index of next char in previous row - 1. So it is easy to write a function based on the index.

 P      A   H   N

[A] [P] L S I I G

 Y      I   R