class Solution {
    int start=0,maxlen=0;
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(start,start+maxlen);
    }
    public void expand(String s ,int l , int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            int len = r-l+1;
            if(len>maxlen){
                maxlen=len;
                start=l;
            }
            l--;
            r++;
        }
    }
}
