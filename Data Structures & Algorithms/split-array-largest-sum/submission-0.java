class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int i : nums){
            l = Math.max(l,i);
            r+=i;
        }
        int res = r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(can(nums,k,mid)){
                res = mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    public boolean can(int [] arr,int k,int cap){
        int sub=1,csum=0;
        for(int i:arr){
            csum+=i;
            if(csum>cap){
                sub++;
                csum=i;
                
            }

            if(sub>k) return false;
        }
        return true;
    }
}