class Solution {
    public boolean isPalindrome(String s) {
        String filtereds = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l =0,r=filtereds.length()-1;
        while(l<r){
            if(filtereds.charAt(l)!=filtereds.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
