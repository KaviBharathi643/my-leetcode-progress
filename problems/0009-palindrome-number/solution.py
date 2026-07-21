class Solution(object):
    def isPalindrome(self, x):
        s=str(x)
        s=s[::-1]
        if(str(x)==s):
            return True
        else:
            return False
        
