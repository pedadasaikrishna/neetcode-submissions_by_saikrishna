class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
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
        HashSet<Integer> set = new HashSet<>();
        for(int j=ind;j<nums.length;j++){
            if(set.contains(nums[j])){
                continue;
            }
            set.add(nums[j]);
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