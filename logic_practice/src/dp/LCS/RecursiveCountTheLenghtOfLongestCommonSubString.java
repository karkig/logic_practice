/*
https://www.geeksforgeeks.org/longest-common-substring-dp-29/

Longest Common Substring(Dynamic Programming)
Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.
Examples:

Input : X = “GeeksforGeeks”, y = “GeeksQuiz”
Output : 5
The longest common substring is “Geeks” and is of length 5.
*/
class RecursiveCountTheLenghtOfLongestCommonSubString
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
       retrun 0;
    } 
}
