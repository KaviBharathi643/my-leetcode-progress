class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ma=Integer.MIN_VALUE;
        while(l<r){
            if(height[l]>=height[r]){
                ma=Math.max(ma,height[r]*(r-l));
                r--;
            }
            else if(height[l]<height[r]){
                ma=Math.max(ma,height[l]*(r-l));
                l++;
            }
        }
        return ma;
    }
}
