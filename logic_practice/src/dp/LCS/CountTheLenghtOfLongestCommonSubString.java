class CountTheLenghtOfLongestCommonSubString
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
            t[i][j] = 0;
          }
      }
    }
}
