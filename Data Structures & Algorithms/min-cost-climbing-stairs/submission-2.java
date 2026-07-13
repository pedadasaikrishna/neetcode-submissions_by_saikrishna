class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        int first = fun(0,cost,0,dp);
        System.out.println(Arrays.toString(dp));
        Arrays.fill(dp,-1);
        int second =  fun(1,cost,0,dp);
        System.out.println(Arrays.toString(dp));
        return Math.min(first,dp[1]);

    }
    public int fun(int ind,int []cost ,int totalCost,int [] dp){
        if(ind>=cost.length){
            return totalCost;
        }
        if(dp[ind]!=-1) return dp[ind];
        int onestep = fun(ind+1,cost,totalCost,dp);
        int twostep = fun(ind+2,cost,totalCost,dp);
        return dp[ind]=cost[ind]+Math.min(onestep,twostep);
    
    }
}


