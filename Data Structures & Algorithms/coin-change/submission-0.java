class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int ans = can(0, coins, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int can(int ind, int[] coins, int amount, int[][] dp) {
        if (amount == 0)
            return 0;

        if (ind == coins.length || amount < 0)
            return Integer.MAX_VALUE;

        if (dp[ind][amount] != -1)
            return dp[ind][amount];

        int pick = can(ind, coins, amount - coins[ind], dp);
        if (pick != Integer.MAX_VALUE)
            pick = 1 + pick;

        int skip = can(ind + 1, coins, amount, dp);

        return dp[ind][amount] = Math.min(pick, skip);
    }
}