class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=h;
        for(int i : piles){
            r=Math.max(i,r);
        }
        int ans =r;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(can(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

    public boolean can(int [] piles , int hrs,int rate){
        int takenHrs=0;
        for(int i:piles){
            takenHrs+=Math.ceil(i/(double) rate);
        }
        return takenHrs<= hrs;
    }
}
