class Solution {
    public int mySqrt(int x) {
        long l = 1 , r = x ,res=0;
        while(l<=r){
            long mid = l +(r-l)/2;
            if(mid*mid==x){
                return (int) mid;
            }else if(mid*mid > x){
                r= mid-1;
            }else {
                res=mid;
                l=mid+1;
            }
        }
        return (int) res;
    }
}