class Solution(object):
    def maxSubArray(self, nums):
        cur=nums[0]
        best=nums[0]
        for i in nums[1:]:
            if(max(i,cur+i)==cur+i):
                cur+=i
                best=max(cur,best)
            else:
                cur=i
                best=max(best,cur)
                
        return best
        
