```
Subtree with Maximum Average 
Given a binary tree, find the subtree with maximum average. Return the root of the subtree.

 Notice

LintCode will print the subtree which root is your return node.
It's guaranteed that there is only one subtree with maximum average.

Example
Given a binary tree:

     1
   /   \
 -5     11
 / \   /  \
1   2 4    -2 
return the node 11.
```
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root the root of binary tree
     * @return the root of the maximum average of subtree
     */
     
    private class resultType{
        private int sum, size;
        public resultType(int sum, int size){
            this.sum =sum;
            this.size =size;
        }
    } 
    private TreeNode subtree =null;
    private resultType subtreeType =null;
     
    public TreeNode findSubtree2(TreeNode root) {
        // Write your code here
        helper(root);
        return subtree;
    }
    
    public resultType helper(TreeNode root){
        if (root == null){
            return new resultType(0,0);
        }
        resultType left = helper(root.left);
        resultType right = helper(root.right);
        resultType result = new resultType (left.sum+ right.sum+ root.val , left.size+right.size+1);
        if (subtree == null || subtreeType.sum * result.size < subtreeType.size*result.sum){
            subtree =root;
            subtreeType =result;
        }
        return result;
    }
    
    
}
