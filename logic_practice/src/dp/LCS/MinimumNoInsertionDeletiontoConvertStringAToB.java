/*
Minimum number of deletions and insertions to transform one string into another
Given two strings ‘str1’ and ‘str2’ of size m and n respectively. The task is to remove/delete and insert minimum number of characters from/in str1 so as to transform it into str2. It could be possible that the same character needs to be removed/deleted from one point of str1 and inserted to some another point.
Example:
Input : str1 = "geeksforgeeks", str2 = "geeks"
Output : Minimum Deletion = 8
         Minimum Insertion = 0 
         
       https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/
       
*/
class MinimumNoInsertionDeletiontoConvertStringAToB
{
  
  public int lcs(String a[],String b[],int n,int m)
  {
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
    
    public static void main(String arg[])
    {
    
      String a[]="abcdd",String b[]="abdcd",int n,int m;
      n = a.length();
      m = b.length();
      int lcsLeng =  lcs(a,b,n,m);

     int insertion = a - lcsLeng;
     int deletion = b - lcsLeng;
     
     System.out.println(a,b);
    
    }
}
