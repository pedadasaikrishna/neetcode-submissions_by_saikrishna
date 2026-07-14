class Solution {
    public int countSubstrings(String s) {
        int cnt =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int l =i,r=j;
                while(l<r && s.charAt(l)==s.charAt(r)){
                    l++;
                    r--;
                }
                if(l>=r){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
