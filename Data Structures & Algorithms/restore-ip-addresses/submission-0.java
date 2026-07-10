class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sub = new StringBuilder();
        dfs(s, 0, 0, sub, res);
        return res;
    }

    public void dfs(String s, int ind, int parts, StringBuilder sub, List<String> res) {
        if (ind == s.length() && parts == 4) {
            res.add(sub.substring(0, sub.length() - 1)); 
            return;
        }

        for (int j = ind; j < Math.min(ind + 3, s.length()); j++) {

            if (isValid(s, ind, j)) {

                int len = sub.length();

                sub.append(s.substring(ind, j + 1));
                sub.append('.');

                dfs(s, j + 1, parts + 1, sub, res);

                sub.setLength(len);
            }
        }
    }

    public boolean isValid(String str, int l, int r) {

        if (l > r)
            return false;

        if (str.charAt(l) == '0' && l != r)
            return false;

        int val = Integer.parseInt(str.substring(l, r + 1));

        return val >= 0 && val <= 255;
    }
}