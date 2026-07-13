class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int t1=1,t2=1;
        for(int i=2;i<=n;i++){
            int next = t1+t2;
            t1=t2;
            t2=next;
        }
        return t2;
    }
}

// 1--> no of ways to reach ith index
// 2--> if(ind==n) return n
// 3--> take 1step or 2 steps
// 4--> return no of ways dp[n]
