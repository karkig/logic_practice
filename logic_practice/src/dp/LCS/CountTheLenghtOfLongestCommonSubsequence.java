/*

Longest Common Subsequence Problem solution using recursion
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 

For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.

https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

*/
class CountTheLenghtOfLongestCommonSubsequence
{
  
  public int lcs(String a[],String b[],int n,int m)
  {
    if(n==0||m==0)
    {
      return 0;
    }
    
    if(a[n] == b[m])
    {
       retrun 1+ lcs(a,b,n-1,m-1); 
    }
    else
    {
       retrun max(lcs(a,b,n-1,m) , lcs(a,b,n,m-1));
    } 
}
