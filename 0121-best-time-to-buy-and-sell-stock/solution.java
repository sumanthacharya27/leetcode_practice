class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int stock=prices[0];
        for(int i=1;i<prices.length;i++){
            if(stock>prices[i]) stock=prices[i];
            if(prices[i]-stock>profit) profit=prices[i]-stock;
        }


        return profit;
    }
}
