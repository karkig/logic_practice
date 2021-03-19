class CountSbubsetSumWithGivenSumProblem {
 
    static int knapSack(int W, int arr[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
 
        for (i = 0; i <= n; i++) 
        {
            for (j = 0; j <= W; w++) 
            {
                if (i == 0)
                    K[i][j] = false;
                if (j == 0)
                    K[i][j] = true;
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
        int n = val.length;
        int s=30;
      
        System.out.println("count of subsetsum with given sum is :"+ knapSack(s, arr, n));
    }
}
