'''
Minimum Subtree
Given a binary tree, find the subtree with minimum sum. Return the root of the subtree.

 Notice

LintCode will print the subtree which root is your return node.
It's guaranteed that there is only one subtree with minimum sum and the given binary tree is not an empty tree.

Example
Given a binary tree:

     1
   /   \
 -5     2
 / \   /  \
0   2 -4  -5 
return the node 1.
'''

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
     * @return the root of the minimum subtree
     */
     
    private TreeNode subtree = null;
    private int subtreeSum = Integer.MAX_VALUE; 
    public TreeNode findSubtree(TreeNode root) {
        // Write your code here
        helper(root);
        return subtree;
    }
    
    public int helper(TreeNode root){
        if (root == null){
            return 0;
        }
        
        int sum = helper(root.left) + helper(root.right)+ root.val;
        if (subtree == null || sum < subtreeSum){
            subtree =root;
            subtreeSum = sum;
            
        }
        return sum;
    }
}
