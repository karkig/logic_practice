/*
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
https://www.geeksforgeeks.org/next-greater-element/
*/
class NearestGreaterToRight 
{
    public static void main(String arg[])
    {
      Stack<Integer> s = new Stack();
      List<Integer> l = new ArrayList();
      
      int a[]={3,4,7,2};
      
      for(int i=a.length-1;i>=0;i--)
      {
        if(s.size()==0)
        {
          l.add(-1);
        }
        else if(s.size()>0 && s.peek()>a[i])
        {
          l.add(s.peek());
        }
        else if(s.size()>0 && s.peek()<=a[i])
        {
          while(s.size()>0 && s.peek()<=a[i])
          {
             s.pop();
          }
          if(s.size()==0){
            l.add(-1);
          }
          else{
           l.add(s.peek()); 
          }
        }
        
        s.push(a[i]);
      }
      
        // Reverse the list and print
        
    }
}
