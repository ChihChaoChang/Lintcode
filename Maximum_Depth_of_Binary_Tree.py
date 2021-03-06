'''
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example
Given a binary tree as follow:

  1
 / \ 
2   3
   / \
  4   5
The maximum depth is 3.

'''

"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""
class Solution:
    """
    @param root: The root of binary tree.
    @return: An integer
    """ 
    def maxDepth(self, root):
        # write your code here
        if root is None:
            return 0
        return max(self.maxDepth(root.left), self.maxDepth(root.right))+1
'''
Traverse
class Solution:
    """
    @param root: The root of binary tree.
    @return: An integer
    """ 
    def maxDepth(self, root):
        # write your code here
         self.depth = 0
         self.helper(root,1)
         return self.depth
    
    def helper(self, node, currentDepth):
        if node is None:
            return 0
        if currentDepth > self.depth:
            self.depth = currentDepth
        self.helper(node.left, currentDepth+1)
        self.helper(node.right, currentDepth+1)

'''
