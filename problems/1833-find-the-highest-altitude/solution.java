class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            high=Math.max(high,sum+gain[i]);
            sum+=gain[i];
        }
        return high;
    }
}
