class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(nums,0,sub,res,target);
        return res;
    }
    public void dfs(int [] nums , int ind ,List<Integer> sub,List<List<Integer>> res,int target){
        if(target==0){
            res.add(new ArrayList<>(sub));
            return ;
        }
        if((ind==nums.length && target!=0) || target<0) return;
        sub.add(nums[ind]);
        dfs(nums,ind,sub,res,target-nums[ind]);
        sub.remove(sub.size()-1);
        dfs(nums,ind+1,sub,res,target);
    }

}
