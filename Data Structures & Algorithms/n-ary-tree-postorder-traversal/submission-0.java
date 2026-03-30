class Solution {

    List<Integer> ans;

    public void dfs(Node root) {

        if (root == null) return;

        if (root.children != null) {
            for (Node ch : root.children) {
                dfs(ch);
            }
        }

        ans.add(root.val);
    }

    public List<Integer> postorder(Node root) {

        ans = new ArrayList<>();
        dfs(root);

        return ans;
    }
}