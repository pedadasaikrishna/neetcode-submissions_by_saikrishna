class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freqs1 = new int [26];
        int [] freqs2 = new int [26];
        for(int i =0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
        }
        int k = s1.length();
        int l=0, r=0;

        while(r<s2.length()){
            char ch = s2.charAt(r);
            freqs2[ch-'a']++;
            if(r-l+1 == k){
                if(Arrays.equals(freqs1,freqs2)){
                    return true;
                }else{
                    freqs2[s2.charAt(l)-'a']--;
                    l++;
                }
            }
            r++;
        }
        return false;
    }
}
