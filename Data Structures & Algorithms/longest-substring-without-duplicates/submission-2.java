class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0,r=0,res=0;

        while(r<s.length()){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l++));
            }
            res = Math.max(res,r-l+1);
            set.add(ch);
            r++;
        }
        return res;

    }
}
