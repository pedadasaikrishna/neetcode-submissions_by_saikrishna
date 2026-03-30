class Solution {
    public int maxArea(int[] ht) {
        int l =0 , r = ht.length-1;
        int max=0;
        while(l<r){
            int area = (r-l) * Math.min(ht[l],ht[r]);
            max=Math.max(max,area);
            if(ht[l]<ht[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }https://imagedelivery.net/CLfkmk9Wzy8_9HRyug4EVA/77f004c6-e773-4e63-7b99-a2309303c700/public$0
}
