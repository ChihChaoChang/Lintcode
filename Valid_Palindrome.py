class Solution:
    """
    @param: s: A string
    @return: Whether the string is a valid palindrome
    """
    def isPalindrome(self, s):
        # write your code here
        newS = ""
        for c in s:
            if ord(c) <= ord('z') and ord(c)>= ord('a'):
                newS += c.lower()
            elif ord(c) <= ord('Z') and ord(c) >= ord('A'):
                newS += c.lower()
            elif ord(c) <= ord('9') and ord(c) >= ord('0'):
                newS += c
        return newS == newS[::-1]
