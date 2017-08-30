'''
Binary Tree Paths
Given a binary tree, return all root-to-leaf paths.
Given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

[
  "1->2->5",
  "1->3"
]

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
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        List <String> paths = new ArrayList<>();
        if (root == null){
            return paths;
        }
        List <String> leftPaths = binaryTreePaths(root.left);
        List <String> rightPaths = binaryTreePaths(root.right);
        
        for (String path : leftPaths){
            paths.add(root.val + "->" + path);
        } 
        for (String path : rightPaths){
            paths.add(root.val + "->"+ path);
        }
        
        if (paths.size()==0){
            paths.add(root.val+"");
        }
        return paths;
        
    }
}
