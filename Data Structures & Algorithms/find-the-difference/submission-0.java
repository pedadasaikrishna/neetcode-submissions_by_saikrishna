class Solution {
    public char findTheDifference(String s, String t) {
        int stot=0,ttot=0;
        for(char ch : s.toCharArray()){
            stot += (ch-'a');
        }
        for(char ch : t.toCharArray()){
            ttot += (ch-'a');
        }
        return (char) (Math.abs(ttot-stot )+ 'a');
    }
}