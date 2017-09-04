'''
Flatten Binary Tree to Linked List
Flatten a binary tree to a fake "linked list" in pre-order traversal.

Here we use the right pointer in TreeNode as the next pointer in ListNode.

 Notice

Don't forget to mark the left child of each node to null. Or you will get Time Limit Exceeded or Memory Limit Exceeded.

Example
              1
               \
     1          2
    / \          \
   2   5    =>    3
  / \   \          \
 3   4   6          4
                     \
                      5
                       \
                        6
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
    /*
     * @param root: a TreeNode, the root of the binary tree
     * @return: 
     */
    private TreeNode lastNode = null;
    public void flatten(TreeNode root) {
        // write your code here
        if (root == null){
            return;
        }
        if (lastNode != null){
            lastNode.left = null;
            lastNode.right = root;
        }
        
        lastNode = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }
}
