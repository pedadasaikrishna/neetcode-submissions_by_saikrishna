class Solution {
    int [][] dp ;
    public int change(int amount, int[] coins) {
        // Arrays.sort(coins);
        dp = new int[coins.length][amount+1];

        return dfs(0,coins,amount);
    }
    private int dfs(int ind , int [] coins , int amount){
        if(amount==0) return 1;
        if(ind==coins.length) return 0;
        if(dp[ind][amount]!=0) return dp[ind][amount];

        int skip = dfs(ind+1,coins,amount);
        int take=0;
        if(coins[ind]<=amount){
            take=dfs(ind,coins,amount-coins[ind]);
        }
        return dp[ind][amount]= skip+take;
    }
}
