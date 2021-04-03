/*
https://www.geeksforgeeks.org/coin-change-dp-7/
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.
For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
*/
class MaximumNumberOfWays_CoinChange {
 
    static int knapSack(int W, int coin[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
 
        for (i = 0; i <= n; i++) 
        {
           K[i][0] = true;
            
        }
     
        for (j = 1; j <= W; w++) 
        {    
                K[0][j] = false;
         }
     
       for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= W; j++) 
            {
                 if (coin[i - 1] <= j)
                    K[i][j]  = K[i][j - coin[i - 1]] + K[i - 1][j]);
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
        int n = val.length;
        int s=30;
      
        System.out.println("count of subsetsum with given sum is :"+ knapSack(s, arr, n));
    }
}
