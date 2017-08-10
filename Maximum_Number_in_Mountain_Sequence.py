'''
Maximum Number in Mountain Sequence 
Given a mountain sequence of n integers which increase firstly and then decrease, find the mountain top.
Example
Given nums = [1, 2, 4, 8, 6, 3] return 8
Given nums = [10, 9, 8, 7], return 10

'''
class Solution:
    # @param {int[]} nums a mountain sequence which increase firstly and then decrease
    # @return {int} then mountain top
    def mountainSequence(self, nums):
        # Write your code here
        left, right =0, len(nums)-1
        
        while left+1 < right:
            m1= left + (right- left)/2
            m2= right -(right- m1)/2
            if nums[m1] < nums[m2]:
                left =m1 +1
            elif nums[m1] > nums[m2]:
                right =m2-1
            else:
                left= m1
                right =m2
        
        return max(nums[left], nums[right]) 
