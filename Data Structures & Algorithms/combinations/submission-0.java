class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int [] nums = new int[n];
        // for(int i=0;i<n;i++){
        //     nums[i]=i+1;
        // }
        dfs(1,n,0,sub,res,k);
        return res;
    }
    public void dfs(int start,int end,int ind ,List<Integer> sub,List<List<Integer>> res,int k){
        if(sub.size()==k){
            res.add(new ArrayList<>(sub));
            return;
        }
        if(start>end) return;
        sub.add(start);
        dfs(start+1,end,ind+1,sub,res,k);

        sub.remove(sub.size()-1);
        dfs(start+1,end,ind+1,sub,res,k);

    }
}
