class Solution {
    int cnt =0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return cnt;
    }
    public void expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            cnt++;
            l--;
            r++;
        }
    } 
}
