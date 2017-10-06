'''
Given a binary tree, return the preorder traversal of its nodes' values.

Example
Given:

    1
   / \
  2   3
 / \
4   5
return [1,2,4,5,3].
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
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preorder = new ArrayList<Integer>();
        if (root == null){
            return preorder;
        }
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            preorder.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return preorder;
    }
}
