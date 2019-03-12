### 679. 24 Game
This problem asks us to find operator and operations (*,/,+,-) to form answer 24.

It could be resolved using DFS for permutations of all operators and operations. However there are two things we need to remember:

1. The permutation could work, but a/b-c/d is different than a/(b-c)/d. So, permutaions for all number is not enough. We need to hand pick two elements, perform operation and add result to new a list
2. This problem is tricky. It doesn't limit us from using integer. So, 1/16 = 0.0625, NOT 0. So, we need to use Double all the times. P.S. remember to consider the scientific error when comparing two double values. 