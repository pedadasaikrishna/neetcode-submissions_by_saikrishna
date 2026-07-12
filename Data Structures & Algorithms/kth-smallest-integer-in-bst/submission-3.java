class Solution {
    int cnt = 0,ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        in(root, k);
        return ans;
    }

    public void in(TreeNode root, int k) {
            if(root==null || ans !=-1) return;
            in(root.left,k);
            cnt++;
            if(cnt==k){
                ans=root.val;
                return;
            }
            in(root.right,k);
    }
}

// We can stop immediately when the ans was not equal to -1 that means value found