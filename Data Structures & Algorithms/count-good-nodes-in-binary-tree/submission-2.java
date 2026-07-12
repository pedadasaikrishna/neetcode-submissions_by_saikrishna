/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int cnt=0;
    public void dfs(TreeNode root,int maxseen){
        if(root==null) return;
        if(root.val>= maxseen){
            cnt++;
            maxseen=root.val;
        }
        dfs(root.left,maxseen);
        dfs(root.right,maxseen);
        
    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        dfs(root,root.val);
        return cnt;
    }
}
