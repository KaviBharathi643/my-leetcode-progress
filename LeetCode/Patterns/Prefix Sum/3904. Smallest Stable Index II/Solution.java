class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ma=nums[0];
        int mi=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mi=Integer.MAX_VALUE;
            if(nums[i]>ma){
                ma=nums[i];
            }
            for(int j=i;j<nums.length;j++){
                if(nums[j]<mi){
                    mi=nums[j];
                }
            }
            int ins=ma-mi;
            if(ins<=k){
                return i;
            }
        }
        return -1;
    }
}