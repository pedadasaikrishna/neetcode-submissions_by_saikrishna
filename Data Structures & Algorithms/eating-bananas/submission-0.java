class Solution {
    private boolean can(int[] piles, int h,int speed){
        int taken = 0;
        for(int i : piles){
            taken+=Math.ceil(i/(double) speed);
        }
        return taken<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=h;
        for(int i : piles){
            r=Math.max(i,r);
        }
        int res =r;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(can(piles,h,mid)){
                res = mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}
