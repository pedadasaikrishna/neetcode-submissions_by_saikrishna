class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0] , l =strs[strs.length-1];
        int i=0;
        String res="";
        while(i<f.length()){
            if(f.charAt(i)==l.charAt(i)){
                res+=f.charAt(i);
            }else{
                return res;
            }
            i++;
        }
        return res;
    }
}