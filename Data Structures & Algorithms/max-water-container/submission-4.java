class Solution {
    public int maxArea(int[] hts) {
        int l =0 ,r = hts.length-1;
        int max=0;
        while(l<r){
            int carea = Math.min(hts[l],hts[r])*(r-l);
            max=Math.max(max,carea);
            if(hts[l]<hts[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
