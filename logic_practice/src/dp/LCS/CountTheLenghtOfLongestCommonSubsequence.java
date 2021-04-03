/*

Longest Common Subsequence Problem solution using recursion
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 

For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.

https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

*/
class CountTheLenghtOfLongestCommonSubsequence
{
  
  public int lcs()
  {
    String a[]="abcdd",String b[]="abdcd",int n,int m;
    int t[n+1][m+1];
    
    for(int i=0;i<m+1;i++)
    {
       t[0][i] = 0;
    }
    for(int i=0;i<n+1;i++)
    {
       t[i][0] = 0;
    }
    
    for(int i=1;i<n+1;i++)
    {
      for(int j=1;j<m+1;j++) 
      {
          if(a[i-1]==b[j-1])
          {
            t[i][j] = 1 + t[i-1][j-1];
          }else
          {
            t[i][j] = max(t[i-1][j],t[i][j-1]);
          }
      }
    }
}
