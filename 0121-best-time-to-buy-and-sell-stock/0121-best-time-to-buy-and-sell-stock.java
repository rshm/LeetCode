class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;
        int sw = 0;
        int profit = 0;
        
       for(int i= 1;i<prices.length;i++){
           if(prices[sw]>prices[i])
               sw = i;
           else
             profit = Math.max(prices[i]-prices[sw],profit);
       }
        
        return profit;
    }
}