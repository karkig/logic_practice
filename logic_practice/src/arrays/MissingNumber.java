/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/


/*
Solution 1:  sum of n natural number is n(n+1)/2.  Calculate the sum of all elements of array as sum and also calculate sumOfNutuarlNo = n(n+1)/2.
              Now missingNumber = sumOfNutuarlNo - sum; 
*/

class MissingNumber {
    int MissingNumber(int array[], int n) {
        int sum=0;
        int sumOfNutuarlNo;
        int missingNumber; 
      
        for(int i=0;i<n-1;i++)
        {
           sum = sum+array[i];
            
        }
        
        sumOfNutuarlNo = (n*(n+1))/2;
        missingNumber = sumOfNutuarlNo - sum
     
          return missingNumber;
        
        
      /*  ===================. Solution 2.
      int t[] = new int[n];
      for(int i=0;i<n-1;i++)
        {
            t[array[i]-1]=1; 
            
        }
        for(int i=0;i<n;i++)
        {
            if(t[i]!=1)
            {
                return i+1;
            }
        }
        return -1;   */
        
    }
}
