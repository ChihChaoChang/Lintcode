'''
Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

Example
Consider the following matrix:

[
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 50]
]
Given target = 3, return true.

'''
class Solution:
    """
    @param matrix, a list of lists of integers
    @param target, an integer
    @return a boolean, indicate whether matrix contains target
    """
    def searchMatrix(self, matrix, target):
        # write your code here
        if not matrix or target is None:
            return False
        
        m=len(matrix[0])
        n=len(matrix)
        
        start, end = 0, m*n-1
        
        while start+1 < end:
            mid = start+ (end-start)/2
            x,y = mid/m, mid%m
            if matrix[x][y] <target:
                start= mid
            else:
                end =mid
                
        x, y =start/m, start%m
        if matrix[x][y]==target:
            return True
        
        x, y =end /m, end%m
        if matrix[x][y] == target:
            return True
        
        return False            
