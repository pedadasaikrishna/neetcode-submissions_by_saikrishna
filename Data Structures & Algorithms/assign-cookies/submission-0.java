class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int j=0;
        for(int i=0;i<g.length;i++){
            if(g[i]<=s[j]){
                j++;
            }
        }
        return j;
    }
}