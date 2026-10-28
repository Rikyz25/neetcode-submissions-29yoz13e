class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i=0
        j=1
        tprof=0
        pprof=0
        while j<len(prices):
            tprof=prices[j]-prices[i]
            pprof=max(tprof,pprof)
            if prices[i]>prices[j]:
                i=j
            j+=1
        return pprof
