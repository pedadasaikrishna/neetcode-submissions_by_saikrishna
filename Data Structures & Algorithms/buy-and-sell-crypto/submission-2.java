class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0,min=Integer.MAX_VALUE;
        for(int i : prices){
            min = Math.min(min,i);
            maxprofit=Math.max(maxprofit,i-min);
        }
        return maxprofit;
    }
}
