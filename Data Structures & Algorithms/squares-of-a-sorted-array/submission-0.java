class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] res = new int [n];
        int l =0,r=n-1,p=r;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                res[p]=nums[l]*nums[l];
                l++;
            }else{
                res[p]=nums[r]*nums[r];
                r--;
            }
            p--;
        }
        return res;
    }
}