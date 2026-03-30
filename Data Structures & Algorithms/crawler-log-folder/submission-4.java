class Solution {
    public int minOperations(String[] logs) {
        int cnt =0 ; 
        for(String str :logs){
            // if(str.length()>=2){
                if(!str.equals("./")){

                    if(str.equals("../")){
                        cnt--;
                        if(cnt<0){
                            cnt=0;
                        }
                    }
                    else{
                        cnt++;
                    }
                }
            // }
        }
        return cnt<0 ? 0 : cnt;
    }
}