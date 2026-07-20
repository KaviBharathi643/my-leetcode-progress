class Solution(object):
    def maxProfit(self, prices):
        mi=prices[0]
        ma=prices[0]
        pro=0
        for i in prices:
            mi=min(mi,i)
            p=i-mi
            pro=max(pro,p)

        return pro


        
