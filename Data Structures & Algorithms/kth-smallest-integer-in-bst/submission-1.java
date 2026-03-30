class Solution {
    int cnt = 0;

    public int kthSmallest(TreeNode root, int k) {
        return in(root, k);
    }

    public int in(TreeNode root, int k) {
        if (root == null) return -1;

        // Go left
        int left = in(root.left, k);
        if (left != -1) return left;

        // Visit node
        cnt++;
        if (cnt == k) return root.val;

        // Go right
        return in(root.right, k);
    }
}