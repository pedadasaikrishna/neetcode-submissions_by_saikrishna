class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length(),w2=word2.length(),i=0,j=0;
        String res ="";
        while(i<w1 && j<w2){
            res+=word1.charAt(i++);
            res+=word2.charAt(j++);
        }
        while(i<w1){
            res+=word1.charAt(i++);

        }
        while(j<w2){
            res+=word2.charAt(j++);

        }
        return res;
    }
}