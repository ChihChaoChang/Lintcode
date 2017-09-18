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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    //private int depth = 0; 
    public int maxDepth(TreeNode root) {
        // write your code here
        
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right)+1;
    }
}

'''
traverse


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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    private int depth; 
    public int maxDepth(TreeNode root) {
        // write your code here
        depth =0 ;
        helper(root,1);
        return depth;
    }
    private void helper(TreeNode node, int currentDepth){
        if (node == null){
            return ;
        }
        
        if(currentDepth > depth){
           depth = currentDepth;
        }
        
        helper(node.left, currentDepth+1);
        helper(node.right, currentDepth+1);
        
    }
    
}


'''
