class Solution {
    public int mySqrt(int x) {
        long l=1 , r =x ,  res=0;
        while(l<=r){
            long mid = l +(r-l) /2 ;
            if((mid * mid)==x){
                return (int) mid;
            }else if(mid*mid < x){
                res = mid;
                l=mid+1;
            }else{
                r = mid-1;
            }
        }
        return (int) res;
    }
}