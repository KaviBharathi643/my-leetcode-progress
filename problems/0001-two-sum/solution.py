class Solution(object):
    def twoSum(self, nums, target):
        seen={}
        for i,num in enumerate (nums):
            tar=target-num
            if tar in seen:
                return [seen[tar],i]
            seen[num]=i



        
