class Solution {
    public int maxProfit(int[] prices) {
        int maxprice = 0,minprice = prices[0];
        for(int i : prices){
            int currprofit = i-minprice;
            maxprice = Math.max(maxprice,currprofit);
            minprice = Math.min(minprice,i);
        }
        return maxprice;
    }
}
