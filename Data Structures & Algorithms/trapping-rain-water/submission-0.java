class Solution {
    public int trap(int[] ht) {
        if(ht==null || ht.length==0) return 0;
        int l =0 , r = ht.length-1;
        int leftMax= ht[l],rightMax=ht[r],res=0;
        while(l<r){
            if(leftMax<= rightMax){
                l++;
                leftMax=Math.max(leftMax,ht[l]);
                res+=(leftMax-ht[l]);
            }else{
                r--;
                rightMax=Math.max(rightMax,ht[r]);
                res+=(rightMax-ht[r]);
                
            }
        }
        return res;
    }
}
