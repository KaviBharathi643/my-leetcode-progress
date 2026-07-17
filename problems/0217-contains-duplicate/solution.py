class Solution(object):
    def containsDuplicate(self, nums):
        seen={}
        for num in nums:
            seen[num]=seen.get(num,0)+1
            if(seen[num]==2):
                return True
        return False
                
        
