'''
with ResultType
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
class ResultType{
    public boolean isBalanced;
    public int maxDepth;
    public ResultType(boolean isBalanced, int maxDepth){
        this.isBalanced = isBalanced;
        this.maxDepth = maxDepth;
    }
}


public class Solution {
    /*
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return helper(root).isBalanced;
    }
    
    public ResultType helper (TreeNode root){
        if (root == null){
            return new ResultType(true,1);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        if (!left.isBalanced || !right.isBalanced){
            return new ResultType(false,0);
        }
        if (Math.abs(left.maxDepth-right.maxDepth)>1){
            return new ResultType(false,0);
        }
        return new ResultType(true, Math.max(left.maxDepth, right.maxDepth)+1);
    }
}
