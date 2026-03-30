class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strs = s.split("\\s+");

        if(pattern.length() != strs.length)
            return false;

        HashMap<Character, String> pmap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = strs[i];

            if(pmap.containsKey(ch)) {
                if(!pmap.get(ch).equals(str))
                    return false;
            } else {
                pmap.put(ch, str);
            }
        }

        return true;
    }
}
