class Solution {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int best=nums[0];
        for (int i=1;i<nums.length;i++){
                cur=Math.max(nums[i],cur+nums[i]);
                best=Math.max(cur,best);
            
            


            
        }
        return best;
    }
}











/*class Solution(object):
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
                
        return best*/
