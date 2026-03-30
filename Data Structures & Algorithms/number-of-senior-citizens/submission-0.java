class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String str : details){
            // System.out.println(str.substring(12,14));
            if(Integer.parseInt(str.substring(11,13))>60){
                cnt++;
            }
        }
        return cnt;
    }
}