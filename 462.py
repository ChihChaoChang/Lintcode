'''
Total Occurrence of Target
Given a target number and an integer array sorted in ascending order. 
Find the total number of occurrences of target in the array.

xample
Given [1, 3, 3, 4, 5] and target = 3, return 2.

Given [2, 2, 3, 4, 6] and target = 4, return 1.

Given [1, 2, 3, 4, 5] and target = 6, return 0.

'''
class Solution:
    # @param {int[]} A an integer array sorted in ascending order
    # @param {int} target an integer
    # @return {int} an integer
    def totalOccurrence(self, A, target):
        # Write your code here
        length=len(A)
        if A == None or length ==0:
            return 0
        mid = 0
        start = 0
        end = length-1
        while start+1 < end:
            mid =start + (end-start)/2
            mid = int(mid)
            #print (mid)
            if A[mid] >= target:
                end = mid
            else:
                start = mid
    
        if A[start] == target:
            left=start
        elif A[end] == target:
            left =end
        else:
            return 0
            
        start, end =  left , length-1
        while  start+1 < end:
            mid =start + (end-start)/2
            mid = int(mid)
            if A[mid] <= target:
                start = mid
            else:
                end = mid

        if A[end] == target:
            right= end
        elif A[start]==target:
            right = start
        else:
            return 0
    
        return  right -left +1
