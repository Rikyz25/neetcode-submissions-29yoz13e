class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int tprof=0;
        int pprof=0;
        while(j<prices.length){
            if(i<j){
                tprof=prices[j]-prices[i];
                pprof=Math.max(pprof,tprof);
                if(prices[j]<prices[i]) i=j;
                j++;
            }
        
    }
    return pprof;
}
}