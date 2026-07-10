class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums,0,0);
    }
    public int dfs(int [] nums ,int ind,int currXor){
        if(ind==nums.length){
            return currXor;
        }
        int take = dfs(nums,ind+1, currXor^ nums[ind]);
        int notTake =dfs(nums,ind+1,currXor);
        return take+notTake;
    }
}