class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l =0 , r =0;
        int maxlen=0;
        while(r<s.length()){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
                maxlen = Math.max(maxlen,r-l+1);
            set.add(ch);
            r++;
        }
        return maxlen;
    }
}
