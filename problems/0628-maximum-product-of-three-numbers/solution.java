class Solution {
    public int maximumProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        int m3=Integer.MIN_VALUE;
        int mi1=Integer.MAX_VALUE;
        int mi2=Integer.MAX_VALUE;
        for (int i:nums){
            if(i>=m1){
                m3=m2;
                m2=m1;
                m1=i;
            }
            else if(i>=m2){
                m3=m2;
                m2=i;
            }
            else if(i>=m3){
                m3=i;
            }
            if(i<=mi1){
                mi2=mi1;
                mi1=i;
            }
            else if(i<=mi2){
                mi2=i;
            }
        }
        return Math.max(m1*m2*m3,mi1*mi2*m1);
    }
}
