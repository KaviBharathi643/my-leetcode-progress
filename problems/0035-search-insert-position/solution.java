class Solution {
    public int searchInsert(int[] nums, int target) {
        int ind=nums.length;
        for (int i=0;i<ind;i++){
            if(nums[i]>=target ){
                return i;
            } 
        } 
        return ind;  
    }
}
