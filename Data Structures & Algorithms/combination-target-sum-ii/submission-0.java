class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0,sub,res,target);
        return res;
    }
    public void  dfs(int [] nums,int ind,List<Integer> sub , List<List<Integer>> res , int target){
        if(target==0){
            res.add(new ArrayList<>(sub));
            return ;
        }
        if(target<0 || ind >= nums.length ) return ;
        sub.add(nums[ind]);

        dfs(nums,ind+1,sub,res,target-nums[ind]);
        sub.remove(sub.size()-1);
        while(ind+1 < nums.length && nums[ind]==nums[ind+1]){
            ind++;
        }
        dfs(nums,ind+1,sub,res,target);


    }
}
