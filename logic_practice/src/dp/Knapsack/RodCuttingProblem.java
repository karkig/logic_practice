/*
Rod cutting in copy of unbounded knapsack


Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example, if length of the rod is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6) 

length   | 1   2   3   4   5   6   7   8  
--------------------------------------------
price    | 1   5   8   9  10  17  17  20
And if the prices are as following, then the maximum obtainable value is 24 (by cutting in eight pieces of length 1) 

length   | 1   2   3   4   5   6   7   8  
--------------------------------------------
price    | 3   5   8   9  10  17  17  20*/
class RodCuttingProblem {
 
    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b) 
    { 
          return (a > b) ? a : b; 
    }
 
    // Returns the maximum value that can
    // be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], 
                        int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
 
   for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= W; w++) 
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
            }
   }
   
              
       for (i = 1; i <= n; i++) 
        {
            for (w = 1; w <= W; w++) 
            {
                 if (wt[i - 1] <= w)
                    K[i][w]  = max(val[i - 1] + K[i][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
 
        return K[n][W];
    }
 
    // Driver code
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
