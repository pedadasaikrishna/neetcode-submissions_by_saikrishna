class Solution {
    public int appendCharacters(String s, String t) {
        int len = t.length()-1,miss=0;
        for(char ch:t.toCharArray()){
            if(s.indexOf(ch)==-1){
                miss++;
            }
        }
        return (s.length()<t.length())?miss: len-miss;
    }
}