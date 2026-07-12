class Solution {
    int pre_ind =0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(preorder,0,inorder.length-1);
    }
    public TreeNode dfs(int [] pre,int l,int r){
        if(l>r) return null;
        int rootval = pre[pre_ind++];
                TreeNode root = new TreeNode(rootval);

        int mid = map.get(rootval);
        root.left = dfs(pre,l,mid-1);
        root.right = dfs(pre,mid+1,r);
        return root;
    }
}
