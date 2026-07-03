class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        fun(nums,0,n-1);
        fun(nums,0,k-1);
        fun(nums,k,n-1);
    }
    public void fun(int [] arr , int l,int r){
        while(l<=r){
            int temp = arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
        }
    }
}
