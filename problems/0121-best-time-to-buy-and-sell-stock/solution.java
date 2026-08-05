class Solution {
    public int maxProfit(int[] prices) {
        int mi=Integer.MAX_VALUE;
        int profit=0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<mi){
                mi=prices[i];
            }
            profit=Math.max(profit,prices[i]-mi);}
        
        return profit;

    }
}
