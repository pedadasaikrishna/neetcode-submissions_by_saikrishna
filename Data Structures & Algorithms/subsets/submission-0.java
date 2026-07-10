class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(nums,0,sub,res);
        return res;
    }
    public void dfs(int [] nums , int ind ,List<Integer> sub,List<List<Integer>> res){
        if(ind==nums.length){
            res.add(new ArrayList<>(sub));
            return ;
        }
        sub.add(nums[ind]);
        dfs(nums,ind+1,sub,res);
        sub.remove(sub.size()-1);
        dfs(nums,ind+1,sub,res);
    }

}
