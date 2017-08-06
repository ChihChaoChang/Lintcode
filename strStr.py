'''
For a given source string and a target string, you should output the first index(from 0) of target string in source string.

If target does not exist in source, just return -1.

Clarification
Do I need to implement KMP Algorithm in a real interview?

Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.
Example
If source = "source" and target = "target", return -1.

If source = "abcdabcdefg" and target = "bcd", return 1.
'''
class Solution:
    def strStr(self, source, target):
        # write your code here
        if source is None or target is None:
            return -1
        len_s = len(source)
        len_t = len(target)
        
        for i in range(len_s - len_t +1):
            j = 0
            while (j < len_t):
                if source[i+j] != target[j]:
                    break
                j+=1
            if j == len_t:
                return i
        return -1
