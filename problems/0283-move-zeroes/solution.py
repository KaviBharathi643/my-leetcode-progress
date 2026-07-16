class Solution(object):
    def moveZeroes(self, nums):
        num=[0]*len(nums)
        p=0
        for i in nums:
            if i!=0:
                num[p]=i
                p+=1
        for i in range(0,len(nums)):
            nums[i]=num[i]
        
        
