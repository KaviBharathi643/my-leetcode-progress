class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int m=c;
        for(int i:nums){
            if(i==1){
                c++;
            }
            else{
                if(c>=m){
                    m=c;
                }
                c=0;
            }
        }
        if(c>=m){
                    m=c;
                }
        return m;
    }
}