class Solution {
    public int minOperations(String[] logs) {
        int cnt =0 ; 
        for(String str :logs){
            if(str.length()>=3){
                if(str.equals("../")){
                    cnt--;
                }
                else{
                    cnt++;
                }
            }
        }
        return cnt;
    }
}