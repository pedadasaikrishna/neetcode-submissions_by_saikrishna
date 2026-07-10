class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,0,res);
        return res;
    }
    public void dfs(int []nums,int ind ,List<List<Integer>> res){
        if(ind==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);

            return ;
        }
        for(int j=ind;j<nums.length;j++){
            swap(nums,ind,j);
            dfs(nums,ind+1,res);
            swap(nums,ind,j);
        }
    }
    public void swap(int []nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
