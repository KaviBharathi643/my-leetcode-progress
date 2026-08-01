class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ma=Integer.MAX_VALUE;
            int l=0;
            int r=0;
            int cursum=0;
            int mi=Integer.MAX_VALUE;
            while(r<nums.length){
                if(cursum+nums[r]>=target){
                    mi=Math.min(mi,(r-l)+1);
                    cursum-=nums[l];
                    l++;
                }
                else{
                    cursum+=nums[r];
                    r++;
                }
            }
            if (mi!=Integer.MAX_VALUE){
                return mi;
            }
            else{
                return 0;
            }
        
    }
}
