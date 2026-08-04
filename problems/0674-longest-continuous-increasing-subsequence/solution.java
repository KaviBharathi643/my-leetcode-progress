class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cur=1;
        int ma=0;
        for (int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                ma=Math.max(ma,cur);
                cur=1;
            }
            else{
                cur++;
            }
        }
        return Math.max(ma,cur);
    }
}
