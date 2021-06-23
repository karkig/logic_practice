/*
Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, .. etc.

https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
*/

class MinimumElementStack_O1_complexcity
{
 
 static Stack s=new Stack();
  static Stack minStack = new Stack[5];
  int minEle;
 pubic static void main(String arg[])
 {
   
   
 }
  
static  void push(int e)
  {
    
    if(minStack.size()==0)
    {
      s.push(e);
      minEle = e;
    }
    else{
      if(e>=minele)
        s.push(e);
      else{
       s.push(2*e-minEle);
        minEle=e;
      }
    }
  }
  
 static int pop()
  {
    if(s.size()=0)
      return -1;  
   if(s.top()>=minEle)
   {
     return s.pop();
   }else
   {
    minEle = 2*minEle-s.peek();
     s.pop();
   }
   
    
  }
  static int top()
  {
    if(stack.size()==0)
      return -1;
    if(stack.peek()>=minEle)
      return stack.peek();
    else
      return minEle;
  }
  
 static int getMinimumelement()
  {
    if(minStack.size()==0)
      return -1;
    else
      return minStack.peek();
  }
  
}
