/*
Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, .. etc.

https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/

*/

class MinimumElementStackWithExtraSpace
{
 
 static Stack s=new Stack();
  static Stack minStack = new Stack[5];
 pubic static void main(String arg[])
 {
   
   
 }
  
static  void push(int e)
  {
    s.push(e);
    if(minStack.size()==0 || e<=minStack.peek())
    {
      minStack.push(e);
    }
  }
  
 static int pop()
  {
    if(s.size()=0)
      return -1;  
     int e = s.pop();
      if(minStack.size()>1&& e==minStack.peek())
      {
         minStack.pop();
      }
    return e;
    
  }
 static int getMinimumelement()
  {
    if(minStack.size()==0)
      return -1;
    else
      return minStack.peek();
  }
  
}
