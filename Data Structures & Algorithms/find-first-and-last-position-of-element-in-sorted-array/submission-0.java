class Solution {

    // Find first occurrence
    private int first(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        int res = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                res = mid;
                r = mid - 1;    
            }
            else if(nums[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return res;
    }

    // Find last occurrence
    private int last(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        int res = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                res = mid;
                l = mid + 1;    
            }
            else if(nums[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{ first(nums,target), last(nums,target) };
    }
}