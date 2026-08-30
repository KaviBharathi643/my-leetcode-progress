class Solution {
    public int thirdMax(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        int m3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(m1!=nums[i] && m2!=nums[i] && m3!=nums[i]){
        if(nums[i]>m1){
            m3=m2;
            m2=m1;
            m1=nums[i];
        }
        else if(nums[i]>m2){
            m3=m2;
            m2=nums[i];
        }
        else if(nums[i]>m3){
            m3=nums[i];
        }}
        }
        if(m3==Integer.MIN_VALUE){
        m3= m1;
        }
    
        return m3;
    }
}