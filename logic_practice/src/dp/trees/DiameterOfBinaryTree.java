public class DiameterOfBinaryTree
{
  class Node{
   Node left, right;
  }
   public static void main(String arg[])
   {
     
   }
  
  int findDiameter(Node node,Integer result)
  {
   if(node == null)
   {
     return 0;
   }
    int leftLen = findDiameter(node.left,res);
    int rightLen= findDiameter(node.right,res);
    
    int temp = max(leftLen,rightLen)+1;
    int ans = max(temp,l+r+1);
    result = max(result,ans);
    
    return temp;
    
  }
  
}
