### 32. Longest Valid Parentheses
Parenthese problems are generally stack problems.

We can add left ( and then remove it after we see ). But how could we know the size of longest Valid Parentheses?

We can insert index to stack instead of the actual parenthese so that we can calculate the distance in realtime. Now we also need to insert ) when seen just to hold the position for length calculation.