
/*
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
*/

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
 
        int ans = Integer.MIN_VALUE;
        int currMax, preMAx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currMax = arr[i];
            currMax = Math.max(currMax,arr[i]+preMAx);
            ans = Math.max(ans,currMax);
            preMAx = currMax;

        }
    
        return ans;
    }
    
}
