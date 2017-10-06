"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""


class Solution:
    """
    @param: root: A Tree
    @return: Preorder in ArrayList which contains node values.
    """
    def preorderTraversal(self, root):
        # write your code here
        preorder =[]
        if root is None:
            return preorder
        stack=[root]
        while stack :
            node= stack.pop()
            preorder.append(node.val)
            if node.right != None:
                stack.append(node.right)
            if node.left !=None:
                stack.append(node.left)
        return preorder
