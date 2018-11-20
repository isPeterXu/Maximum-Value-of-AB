# Maximum-value-of-a-b-
Dynamic programming

Given an array a[0..n] of positive numbers, 
Option 4 requires to find an array b[0..n] which assigns 0 or 1 to b[j] and maximize the value of a[i]*b[j].  
Let S[n] denote the maximum value of a[i]*b[j] which can be achieved using first n numbers of a[0..n], 
such that no consecutive k numbers are selected. 

Class MaxValue:
This class only have one method

Method getMaxSum(int[] a, int k):
Modifier and Type: int
Returns the maximum value of a[i]*b[j]
