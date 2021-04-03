/*
Diameter of Tree
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

https://www.geeksforgeeks.org/diameter-of-a-binary-tree-in-on-a-new-method/
*/

public class DiameterOfBinaryTree
{
  class Node{
   Node left, right;
  }
   public static void main(String arg[])
   {
     int result = Integer.MIN_VALUE;
     findDiameter(node);
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
