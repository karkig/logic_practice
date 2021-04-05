/*
Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42

https://leetcode.com/problems/binary-tree-maximum-path-sum/

*/
public class MaximumPathSum
{
  class Node{
   Node left, right;
    Integer value;
  }
   public static void main(String arg[])
   {
     int result = Integer.MIN_VALUE;
     maxPathSum(node);
   }
  
  int maxPathSum(Node node,Integer result)
  {
   if(node == null)
   {
     return 0;
   }
    int leftValue = findDiameter(node.left,res);
    int rightValue= findDiameter(node.right,res);
    
    int temp = max(max(leftValue,rightValue)+node.value, node.value);
    int ans = max(temp,(leftValue+rightValue+node.value));
    result = max(result,ans);
    
    return temp;
    
  }
  
}
