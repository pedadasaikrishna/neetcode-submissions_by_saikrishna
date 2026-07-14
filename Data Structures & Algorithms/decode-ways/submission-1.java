class Solution {
    public int numDecodings(String s) {
        int dp [] = new int[s.length()];
        Arrays.fill(dp,-1);
        return dfs(0,s,dp);
    }
    // public int dfs(int ind,String s){
    //     if(ind==s.length()) return 1;
    //     if(s.charAt(ind)=='0') return 0;
    //     int ways = dfs(ind+1,s);
    //     if(ind+1<s.length()){
    //         int num =( s.charAt(ind)-'0') *10 + s.charAt(ind+1)-'0';
    //         if(num>=10 && num<=26){
    //             ways += dfs(ind+2,s); 
    //         }
    //     }
    //     return ways;
    // }
    public int dfs(int ind,String s,int [] dp){
        if(ind==s.length()) return 1;
        if(s.charAt(ind)=='0') return 0;
        if(dp[ind]!=-1) return dp[ind];
        int ways = dfs(ind+1,s,dp);
        if(ind+1<s.length()){
            int num =( s.charAt(ind)-'0') *10 + s.charAt(ind+1)-'0';
            if(num>=10 && num<=26){
                ways += dfs(ind+2,s,dp); 
            }
        }
        return dp[ind]= ways;
    }
}
