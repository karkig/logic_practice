/*
Target Sum Problem
Given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.

Example 1:
Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.

PROBLEM STATEMENT LINK:https://leetcode.com/problems/target-sum/
*/
class CountNumberOfSubsetWithTargetSum {
 
    static int subsetSum(int W, int arr[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
 
        for (i = 0; i <= n; i++) 
        {
            for (j = 0; j <= W; w++) 
            {
                if (i == 0)
                    K[i][j] = true;
                if (j == 0)
                    K[i][j] = false;
            }
        }
   
              
       for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= W; j++) 
            {
                 if (arr[i - 1] <= j)
                    K[i][j]  = K[i - 1][j - arr[i - 1]] + K[i - 1][j]);
                else
                    K[i][j] = K[i - 1][j];
            }
        }
 
        return K[n][W];
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = new int[] { 10, 20, 30 };
        int s
        int n = val.length;
        int diff = 20;
        int totoal = 60;
      /* s1 - s2 = diff ------------1
         s1 + s2 = total -----------2
      
      add 1 and 2
      2s1 = diff + total
      s1 = (diff + total)/2
      
      */
      s = (diff + total)/2 ; 
      
      
        System.out.println(subsetSum(s, arr, n));
    }
}
